package com.example.examen2Back1.controllers;

import com.example.examen2Back1.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
public class CotrollerCliente {
    @Autowired
    ServiceCliente serviceCliente;

    @PostMapping
}
