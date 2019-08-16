package dao.impl;

import dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }
}
