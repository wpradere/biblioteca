package com.app.prueba.biblioteca.service;

import com.app.prueba.biblioteca.entity.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findOne(Long id);
}
