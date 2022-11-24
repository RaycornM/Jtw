package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Product extends BaseEntity implements Serializable {
    private Integer id;
    private String name;
    private String title;
    private double price;
    private double salePrice;
    private Byte status;
    private Category category;

    /**
     * 商品图片
     */
    List<ProductImage> images;

    /**
     * 默认构造方法
     */
    public Product() {

    }

    /**
     * 有参构造方法
     * @param name
     * @param title
     * @param price
     * @param salePrice
     * @param category
     * @param status
     */
    public Product(String name, String title, double price, double salePrice, Category category, Byte status) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.salePrice = salePrice;
        this.category = category;
        this.status = status;
    }
}
