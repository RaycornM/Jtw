package cn.tedu.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *  MD5加密
 */
public class CodeUtil {
    public static String getMd5Encoding(String password){
        //创建加密计算器
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //数据加密
        md5.update(password.getBytes());
        //输出
        return new BigInteger(1,md5.digest()).toString(16);
    }
}
