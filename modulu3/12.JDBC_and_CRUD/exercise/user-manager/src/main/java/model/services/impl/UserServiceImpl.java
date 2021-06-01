package model.serviec.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.serviec.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImp implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(int id, User user) {
        return userRepository.update(id,user);
    }

    @Override
    public List<User> search(String country) {
        return userRepository.search(country);
    }

    @Override
    public List<User> sortList() {
        return userRepository.sortList();
    }
}
