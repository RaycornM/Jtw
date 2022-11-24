package cn.tedu.controller;

import cn.tedu.entity.Product;
import cn.tedu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/listPage")
    public List<Product> listPage() {
        List<Product> products = productService.listPage();
        return products;
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        Product product = productService.getById(id);
        return product;
    }
}
