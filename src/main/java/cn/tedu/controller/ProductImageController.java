package cn.tedu.controller;

import cn.tedu.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productImage")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    @GetMapping("/getByProduct/{pid}") // {pid}REST风格URL地址中的占位符
    public String getByProduct(@PathVariable Integer pid) { // @PathVariable获取REST风格URL中的参数
        String imageSrc = productImageService.getByProduct(pid);
        return imageSrc;
    }
}
