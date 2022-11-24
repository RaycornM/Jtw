package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem extends BaseEntity implements Serializable {
    private Integer id;
    private Integer quantity;
    private Double price;
    private String userMessage;
    public Product product;
    public Order order;

    /**
     * 默认构造方法
     */
    public OrderItem() {

    }

    /**
     * 有参构造方法
     * @param quantity
     * @param price
     * @param product
     * @param order
     * @param userMessage
     */
    public OrderItem(Integer quantity, Double price, Product product, Order order, String userMessage) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
        this.order = order;
        this.userMessage = userMessage;
    }
}
