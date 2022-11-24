package cn.tedu.controller;

import cn.tedu.entity.User;
import cn.tedu.exception.UserException;
import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

//@Controller
@RestController // 把当前的对象交给Spring管理, 当前类的所有方法全部返回JSON　
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 接收POST请求
    // @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    //@ResponseBody // 以JSON的格式返回
    @PostMapping("/register")
    public String register(User user) {
        try {
            userService.register(user);
        } catch (UserException e) {
            // 获取异常信息
            String msg = e.getMessage();
            return msg;
        }
        return "success";
    }
    // 用户登录
    @PostMapping("/login")
    public String login(User user, HttpSession session) {
        try {
            User loginUser = userService.login(user.getUsername(), user.getPassword());
            // 把登录的用户存入session中
            session.setAttribute("loginUser", loginUser);
        } catch (UserException e) {
            String msg = e.getMessage();
            return msg;
        }
        return "success";
    }
}


