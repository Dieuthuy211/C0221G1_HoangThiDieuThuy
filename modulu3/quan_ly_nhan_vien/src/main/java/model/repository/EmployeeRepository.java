package model.repository;

import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_BY_ALL="select*from employee";
    final String SELECT_BY_ID="select*from employee where employee_id=?";
    final String INSERT="insert into employee(employee_name,employee_brithday)\n" +
            "values(?,?)";
    final  String UPDATE="update employee\n" +
            "set employee_name=?,employee_brithday=?\n" +
            "where employee_id=?";
    final  String DELETE="delete from employee where employee_id=?";
    final String SEARCH="select* from employee\n" +
            "where employee_name like ?";

    public List<Employee> search(String search) {
        Connection connection = baseRepository.connectDataBase();
        List<Employee> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_brithday");
                list.add(new Employee(id, name, birthday));
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


    public Employee listById(int id) {
        Employee employee = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_brithday");
               employee= new Employee(id, name, birthday);

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }



    public boolean update(Employee employee) {
        boolean rowUpdated = false;
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setInt(3, employee.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;

    }


    public void insert(Employee employee) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public List<Employee> listEmployee() {
        List<Employee> list = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_brithday");
                list.add(new Employee(id, name, birthday));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}
