package cn.tedu.dao;

import cn.tedu.entity.Cart;
import cn.tedu.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDao {
    public void save(Cart cart);
    //用户的购物车中是都有该商品
    public Cart getCart(Cart cart);
    // 修改购物中商品数量
    public void updateQuantity(Cart cart);
    // 用户查询自己的购物车记录
    public List<Cart> getByUser(int userId);
    // 根据ID查询一条购物车记录
    public Cart getById(int id);
    // 用户删除购物车记录
    public void delete(int id);
}
