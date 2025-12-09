package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Pedido;
import com.example.examen2Back1.repositories.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePedido {
    @Autowired
    private IPedido repositorio;

    public Pedido savePedido(Pedido pedido) {
        return repositorio.save(pedido);
    }
}
