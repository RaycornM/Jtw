package cn.tedu.service.impl;

import cn.tedu.dao.CartDao;
import cn.tedu.entity.Cart;
import cn.tedu.entity.Product;
import cn.tedu.service.CartService;
import cn.tedu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartServiceImpl implements CartService {
    @Autowired(required = false)
    private CartDao cartDao;
    @Autowired
    private ProductService productService;
    @Override
    public void save(Cart cart) {
        Cart c = cartDao.getCart(cart);
        //如果有同样的商品
        if (c != null){
            c.setQuantity(c.getQuantity() + cart.getQuantity());
            c.setAmount(c.getAmount() + cart.getAmount());
            //修改商品数量
            cartDao.updateQuantity(c);
        }
        //如果没有
        else {
            cartDao.save(cart);
        }
    }

    @Override
    public Product getProduct(int productId) {
        return productService.getById(productId);
    }

    @Override
    public List<Cart> getByUser(int userId) {
        return cartDao.getByUser(userId);
    }

    @Override
    public void updateQuantity(Cart cart) {
        cartDao.updateQuantity(cart);
    }

    @Override
    public Cart getById(int id) {
        return cartDao.getById(id);
    }

    @Override
    public void delete(int id) {
        cartDao.delete(id);
    }
}
