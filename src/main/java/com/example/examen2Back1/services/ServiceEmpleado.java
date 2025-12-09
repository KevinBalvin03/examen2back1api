package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Empleado;
import com.example.examen2Back1.repositories.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmpleado {
    @Autowired
    private IEmpleado repositorio;

    public Empleado saveEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }
}
