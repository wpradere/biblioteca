package com.app.prueba.biblioteca.service;

import com.app.prueba.biblioteca.entity.Prestamo;

import java.util.List;

public interface PrestamoService {

    public List<Prestamo> find();
    public Prestamo findOne(String isnb);
}
