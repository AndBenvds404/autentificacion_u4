package com.example.pw_autorizacion_u4_ab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pw_autorizacion_u4_ab.service.UsuarioServiceImpl;
import com.example.pw_autorizacion_u4_ab.service.dto.UsuarioTo;

@RequestMapping("/tokens")
@RestController
@CrossOrigin
public class TokenControllerResful {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping
    public String obtenerToken(@RequestBody UsuarioTo usuario) {

        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.vS_i5VRtYot760a9J2HAFP7JyHCk2c31I0E8kjQHctA";

    }

}
