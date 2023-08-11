package com.example.pw_autorizacion_u4_ab.security;

import java.util.Date;

import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {

    public String generateJwtToken(Authentication authentication, String nombre) {

        return Jwts.builder().setSubject(nombre).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 10000))
                .signWith(SignatureAlgorithm.HS512, "semilla1").compact();

    }
}
