package cn.tedu.entity;

import lombok.Data;

/**
 * 地址（省市县）实体类
 */
@Data
public class Address extends BaseEntity {
    private String id;
    private String name;
    private Address regionId;
}
