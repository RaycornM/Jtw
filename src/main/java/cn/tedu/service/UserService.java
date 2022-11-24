package cn.tedu.service;

import cn.tedu.entity.User;

public interface UserService {
    public void register(User user);
    public User login(String username, String password);
}
