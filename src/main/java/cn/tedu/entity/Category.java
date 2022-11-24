package cn.tedu.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category extends BaseEntity implements Serializable {
    private Integer id;
    private String name;
    private String imageSrc;

    /**
     * 默认构造方法
     */
    public Category() {

    }

    /**
     * 有参构造方法
     * @param name
     * @param imageSrc
     */
    public Category(String name, String imageSrc) {
        this.name = name;
        this.imageSrc = imageSrc;
    }
}
