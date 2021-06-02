package model.service.impl;

import model.bean.User;
import model.repository.BaseRepository;
import model.repository.UserRepository;
import model.service.IUserSevrice;

import java.sql.SQLException;
import java.util.List;

public class UserSeviceImpl implements IUserSevrice {
    UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }


}
