package cn.tedu.service.impl;

import cn.tedu.dao.ProductImageDao;
import cn.tedu.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired(required = false)
    private ProductImageDao productImageDao;
    @Override
    public String getByProduct(Integer pid) {
        return productImageDao.getByProduct(pid);
    }
}
