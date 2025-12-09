package com.example.examen2Back1.controllers;

import com.example.examen2Back1.services.ServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empleado")
public class CotrollerEmpleado {
    @Autowired
    ServiceEmpleado serviceEmpleado;

    @PostMapping
}
