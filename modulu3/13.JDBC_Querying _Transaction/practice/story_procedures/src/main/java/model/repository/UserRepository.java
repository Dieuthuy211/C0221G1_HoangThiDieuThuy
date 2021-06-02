package model.repository;

import com.mysql.cj.jdbc.CallableStatement;
import model.bean.User;
import sun.dc.pr.PRError;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String SELECT_ALL_USERS = "select * from users";
    final String DELETE_USERS_SQL = "delete from users where id = ?;";
    final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    final String CALL_INSERT="call insert_user(?,?,?)";
    final String CALL_SELECT_ID="call select_id(?)";


    public UserRepository() {
    }

    public void insertUser(User user) {
     Connection connection=baseRepository.connectDataBase();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = connection.prepareStatement(CALL_INSERT);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public User selectUser(int id) {
        User user =null;
        Connection connection=baseRepository.connectDataBase();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(CALL_SELECT_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(id);
                String name=resultSet.getString("name");
                String email=resultSet.getString("email");
                String country=resultSet.getString("country");
                user=new User(id1,name,email,country);

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public List<User> selectAllUser() {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        List<User> user = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user.add(new User(id, name, email, country));
            }

        } catch (SQLException e) {
            printSQLException(e);
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    public boolean deleteUser(int id) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement statement = null;
        boolean rowDeleted = false;
        try {
            statement = connection.prepareStatement(DELETE_USERS_SQL);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rowDeleted;
    }

    public boolean updateUser(User user) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement statement = null;
        boolean rowUpdated = false;
        try {
            statement = connection.prepareStatement(UPDATE_USERS_SQL);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}