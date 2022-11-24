package cn.tedu.service.impl;

import cn.tedu.dao.ProductDao;
import cn.tedu.entity.Product;
import cn.tedu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired(required = false)
    private ProductDao productDao;
    @Override
    public List<Product> listPage() {
        return productDao.listPage();
    }

    @Override
    public Product getById(Integer id) {
        return productDao.getById(id);
    }
}
