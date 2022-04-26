package com.hui.xiaomi.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class JWTUtils {
    private static final String SING = "123@hui";
    //创建token
    public static String  createJWT(Integer customerId) throws UnsupportedEncodingException {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,3);  //设置token过期时间为3天
        String token = JWT.create().
                withClaim("customerId", customerId). //添加负载信息(可根据实际情况增加)
                withExpiresAt(instance.getTime()). //设置过期时间
                sign(Algorithm.HMAC256(SING));  //设置签名
        return token;
    }
    //解析token
    public static DecodedJWT verify(String token) throws UnsupportedEncodingException {
        return   JWT.require(Algorithm.HMAC256(SING)).build().verify(token);
    }
}

