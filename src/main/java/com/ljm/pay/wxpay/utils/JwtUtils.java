package com.ljm.pay.wxpay.utils;

import com.ljm.pay.wxpay.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {
    public static final String SUBJECT = "xdclass";
    public static final long EXPIRE = 1000 * 60 * 60 * 24 * 7;
    public static final String APPSECRET = "xd666";

    public static String geneJsonWebToken(User user) {
        String token = Jwts.builder().setSubject(SUBJECT).claim("id", user.getId())
                .claim("name", user.getName())
                .claim("img", user.getHeadImg())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();
        return token;
    }

    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
