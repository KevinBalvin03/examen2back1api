package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Cliente;
import com.example.examen2Back1.repositories.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCliente {
    @Autowired
    private ICliente repositorio;

    public Cliente saveCliente(Cliente cliente) {
        return repositorio.save(cliente);
    }
}
