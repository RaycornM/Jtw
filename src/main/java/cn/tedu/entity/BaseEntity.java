package cn.tedu.entity;

import lombok.Data;

import java.util.Date;

/**
 * 基本实体类，用于封装createTime和modifiedTime
 */
@Data
public class BaseEntity {
    private Date createTime;
    private Date modifiedTime;

}
