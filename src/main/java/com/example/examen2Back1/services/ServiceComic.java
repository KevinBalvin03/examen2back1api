package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Comic;
import com.example.examen2Back1.repositories.IComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComic {
    @Autowired
    private IComic repositorio;

    public Comic saveComic(Comic comic) {
        return repositorio.save(comic);
    }
}
