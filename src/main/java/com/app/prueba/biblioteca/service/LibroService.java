package com.app.prueba.biblioteca.service;

import com.app.prueba.biblioteca.model.entity.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findOne(Long id);
    public Libro findOneLibro(String isbn);
}
