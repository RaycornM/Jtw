package cn.tedu.service;

import cn.tedu.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listPage();
    public Product getById(Integer id);
}
