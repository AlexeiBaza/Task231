package web.dao;

import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDaoImpl implements UserDAO{
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void removeUser(long id) {

    }

    @Override
    public void updateUser(User user) {

    }
}
