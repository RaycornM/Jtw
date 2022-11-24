package cn.tedu.controller;

import cn.tedu.entity.Cart;
import cn.tedu.entity.Product;
import cn.tedu.entity.User;
import cn.tedu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired(required = false)
    private CartService cartService;

    //添加商品到购物车
    @PostMapping
    public String addCart(Integer productId, Integer quantity, HttpSession session, HttpServletResponse resp) {
        // 从session中获取登录用户
        User loginUser = (User) session.getAttribute("loginUser");
        Cookie cookie = new Cookie("name", "zhangsan");
        resp.addCookie(cookie);
        // 用户未登录
        if (loginUser == null) {
            return "login";
        }
        else {
            // 获取商品
            Product product = cartService.getProduct(productId);
            double amount = product.getSalePrice() * quantity;
            // 创建购物车对象
            Cart cart = new Cart(product, quantity, amount, loginUser);
            // 保存购物车数据
            cartService.save(cart);
            return "success";
        }
    }
    //用户查询自己的购物车记录
    @GetMapping("/carts")
    public List<Cart> getByUser(HttpSession session){
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser == null){
            return null;
        }
        else {
            List<Cart> carts = cartService.getByUser(loginUser.getId());
            return carts;
        }
    }
    // 用户修改购物车商品数量
    @PutMapping("/updateQuantity")
    public String updateQuantity(Integer quantity, Integer cid) {
        Cart cart = cartService.getById(cid);
        // 修改商品数量
        cart.setQuantity(quantity);
        // 修改购物车金额
        cart.setAmount(cart.getProduct().getSalePrice() * quantity);
        cartService.updateQuantity(cart);
        return "success";
    }
    // 删除一条购物车记录
    @DeleteMapping("/{id}")
    public String deleteOne(@PathVariable Integer id) {
        cartService.delete(id);
        return "success";
    }
}
