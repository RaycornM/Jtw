package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户实体类，和数据库表t_user对应
 */
@Data
public class User extends BaseEntity implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Byte gender;
    private Date birthday;
    private Address address;
    private Address hometown;
    private String profilePictureSrc;

    /**
     * 用户购物车集合
     */
    private List<Cart> carts;
    /**
     * 用户订单集合
     */
    private List<Order> orders;
    /**
     * 默认构造方法
     */
    public User() {

    }

    /**
     * 有参构造方法
     * @param username
     * @param nickname
     * @param password
     * @param gender
     * @param birthday
     * @param address
     * @param profilePictureSrc
     */
    public User(String username, String nickname, String password, Byte gender, Date birthday, Address address, Address hometown, String profilePictureSrc) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.hometown = hometown;
        this.profilePictureSrc = profilePictureSrc;
    }
}
