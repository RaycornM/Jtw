package cn.tedu.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductImageDao {
    /**
     * 根据商品的id查询一张商品图片名字
     * @param pid -- 商品id
     * @return -- 返回一张图片名字
     */
    public String getByProduct(Integer pid);
}
