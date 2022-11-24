package cn.tedu.dao;

import cn.tedu.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 持久层声明
public interface UserDao {
    public void register(User user);
    public User login(String username);
}
