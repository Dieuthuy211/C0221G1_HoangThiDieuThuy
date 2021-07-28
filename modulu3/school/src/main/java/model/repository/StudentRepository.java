package model.repository;

import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String SELECT_BY_ALL = "select *from school.student";
    final String INSERT = "INSERT INTO school.`student` (s_name, gender, birthday, email, address, point) VALUES (  ?,?,?,?,?,?)";
    final String UPDATE = "update school.`student` \n" +
            "set s_name=?,gender=?,birthday=?,email=?,address=?,`point`=? \n" +
            "where id=";
    final String SELECT_BY_ID="select *from school.student where id=?";
    final  String DELETE="delete from student where id=?";
    final String SEARCH="select* from school.student\n" +
            "where s_name like ?";

    public List<Student> search(String search) {
        Connection connection = baseRepository.connectDataBase();
        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("s_name");
                String gender = resultSet.getString("gender");
                String birthday = resultSet.getString("birthday");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Double point = resultSet.getDouble("point");

                list.add(new Student(id, name, gender, birthday, email, address, point));
            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public boolean delete(int id) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        boolean rowDeleted = false;
        try {
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rowDeleted;
    }


    public Student listById(int id) {
        Student student = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("s_name");
                String gender = resultSet.getString("gender");
                String birthday = resultSet.getString("birthday");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Double point = resultSet.getDouble("point");

                student=new  Student(id, name, gender, birthday, email, address, point);

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return student;
    }



    public boolean update(Student student) {
        boolean rowUpdated = false;
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getGender());
            preparedStatement.setString(3, student.getBirthday());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.setDouble(6, student.getPoint());
            preparedStatement.setInt(7, student.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;

    }


    public void insert(Student student) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getGender());
            preparedStatement.setString(3, student.getBirthday());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.setDouble(6, student.getPoint());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public List<Student> listStudent() {
        List<Student> list = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("s_name");
                String gender = resultSet.getString("gender");
                String birthday = resultSet.getString("birthday");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Double point = resultSet.getDouble("point");

                list.add(new Student(id, name, gender, birthday, email, address, point));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}
