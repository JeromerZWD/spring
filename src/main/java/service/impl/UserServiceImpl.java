package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //required = false 设置该属性不是必需的  默认为true
    //autowired 注解 有两个实现会报错
    //@Autowired(required = false)
    @Resource(name = "userDaoImpl")
    private UserDao userDao;
    //利用set方法注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
    userDao.addUser();
    }
}
