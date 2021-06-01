package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> selectAllUser();
    boolean updateUser(int id,User user) throws SQLException;
    boolean deleteUser(int id) throws SQLException;
    User selectUser(int id);

}
