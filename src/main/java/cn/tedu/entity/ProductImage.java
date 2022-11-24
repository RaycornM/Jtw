package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品图片实体类
 */
@Data
public class ProductImage extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 类型(0:概述图片 1:详情图片)
     */
    private Byte type;
    /**
     * 图片地址
     */
    private String src;
    /**
     * 关联商品
     */
    private Product product;

    /**
     * 默认构造方法
     */
    public ProductImage() {

    }

    /**
     * 有参构造方法
     * @param type
     * @param src
     * @param product
     */
    public ProductImage(Byte type, String src, Product product) {
        this.type = type;
        this.src = src;
        this.product = product;
    }
}
