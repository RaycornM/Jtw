package cn.tedu.service.impl;

import cn.tedu.dao.UserDao;
import cn.tedu.entity.User;
import cn.tedu.exception.UserException;
import cn.tedu.service.UserService;
import cn.tedu.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 把当前的类交给Spring管理
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserDao userDao;
    @Override
    public void register(User user) {
        if (user.getUsername() == null || user.getUsername().equals("")) {
            // 抛出异常
            throw new UserException("用户名不能为空");
        }
        if (user.getPassword() == null || user.getPassword().equals("")) {
            throw new UserException("密码不能为空");
        }
        if (user.getNickname() == null || user.getNickname().equals("")) {
            throw new UserException("昵称不能为空");
        }
        // 对密码加密
        String password = CodeUtil.getMd5Encoding(user.getPassword());
        user.setPassword(password);

        userDao.register(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.login(username);
        if (user == null) {
            throw new UserException("用户名不存在");
        }
        if (!CodeUtil.getMd5Encoding(password).equals(user.getPassword())) {
            throw new UserException("密码不正确");
        }
        return user;
    }
}
