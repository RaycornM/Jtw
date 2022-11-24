package cn.tedu.service;

import cn.tedu.entity.Cart;
import cn.tedu.entity.Product;

import java.util.List;

public interface CartService {
    public void save(Cart cart);
    public Product getProduct(int productId);
    public List<Cart> getByUser(int userId);
    public void updateQuantity(Cart cart);
    public Cart getById(int id);
    public void delete(int id);

}
