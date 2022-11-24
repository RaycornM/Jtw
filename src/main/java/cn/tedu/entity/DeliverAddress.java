package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeliverAddress extends BaseEntity implements Serializable {
    private Integer id;
    private Address address;
    private String detailAddress;
    private String post;
    private String receiver;
    private String mobile;
    private int deliverIsDefault;
    private Byte defaultAddress;
    private User user;

    /**
     * 默认构造方法
     */
    public DeliverAddress() {

    }

    /**
     * 有参构造方法
     * @param address
     * @param detailAddress
     * @param post
     * @param receiver
     * @param mobile
     * @param defaultAddress
     * @param user
     */
    public DeliverAddress(Address address, String detailAddress, String post, String receiver, String mobile, Byte defaultAddress, User user) {
        this.address = address;
        this.detailAddress = detailAddress;
        this.post = post;
        this.receiver = receiver;
        this.mobile = mobile;
        this.defaultAddress = defaultAddress;
        this.user = user;
    }
}
