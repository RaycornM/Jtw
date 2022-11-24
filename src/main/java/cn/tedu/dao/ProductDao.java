package cn.tedu.dao;

import cn.tedu.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductDao {
    public List<Product> listPage();
    // 查询一件商品
    public Product getById(Integer id);
}
