package model.repository;

import model.bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String CALL_SP_SELECT = "call select_user()";
    final String CALL_SP_DELETE = "call delete_user(?)";
    final String CALL_SP_UPDATE = "call update_user(?,?,?,?)";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";

    public List<User> listUser() {
        Connection connection = baseRepository.connectDataBase();
        List<User> userList = new ArrayList<>();
        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall(CALL_SP_SELECT);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                userList.add(user);
            }
            callableStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;


    }

    public boolean delete(int id) {
        Connection connection = baseRepository.connectDataBase();
        CallableStatement callableStatement = null;
        boolean check = false;

        try {
            callableStatement = connection.prepareCall(CALL_SP_DELETE);
            callableStatement.setInt(1, id);
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    public boolean UpDate(int id, User user) {
        Connection connection = baseRepository.connectDataBase();
        CallableStatement callableStatement = null;
        boolean check = false;
        try {
            callableStatement = connection.prepareCall(CALL_SP_UPDATE);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, id);
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    public User selectUser(int id) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        User user = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        UserRepository userRepository=new UserRepository();
        System.out.println(userRepository.listUser());
    }
}