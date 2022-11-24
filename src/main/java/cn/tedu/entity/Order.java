package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order extends BaseEntity implements Serializable {
    private Integer id;
    private String code;
    private Double totalPrice;
    private Date payDate;
    private Date deliveryDate;
    private Date confirmDate;
    private Byte status;
    public DeliverAddress deliverAddress;
    public User user;

    /**
     * 默认构造方法
     */
    public Order() {

    }

    /**
     * 有参构造方法
     * @param code
     * @param totalPrice
     * @param payDate
     * @param deliveryDate
     * @param confirmDate
     * @param status
     * @param deliverAddress
     * @param user
     */
    public Order(String code, Double totalPrice, Date payDate, Date deliveryDate, Date confirmDate, Byte status, DeliverAddress deliverAddress, User user) {
        this.code = code;
        this.totalPrice = totalPrice;
        this.payDate = payDate;
        this.deliveryDate = deliveryDate;
        this.confirmDate = confirmDate;
        this.status = status;
        this.deliverAddress = deliverAddress;
        this.user = user;
    }
}
