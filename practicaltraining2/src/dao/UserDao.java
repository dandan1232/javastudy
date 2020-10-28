package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    public int add(User user);

    public int delete(User user);

    public int delete1(User user);

    public int update(User user);

    public User getById(int id);

    public List<User> getByType(int type);

    public List<User> getAll();
}
