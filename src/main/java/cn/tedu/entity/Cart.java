package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 购物车实体类
 */
@Data
public class Cart extends BaseEntity implements Serializable {
    private Integer Id;
    public Product product;
    private Integer quantity;
    private Double amount;
    private User user;

    /**
     * 默认构造方法
     */
    public Cart() {

    }

    /**
     * 有参构造方法
     * @param product
     * @param quantity
     * @param amount
     * @param user
     */
    public Cart(Product product, Integer quantity, Double amount, User user) {
        this.product = product;
        this.quantity = quantity;
        this.amount = amount;
        this.user = user;
    }
}
