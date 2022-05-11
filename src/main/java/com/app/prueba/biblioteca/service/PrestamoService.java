package com.app.prueba.biblioteca.service;

import com.app.prueba.biblioteca.model.entity.Prestamo;

import java.util.List;

public interface PrestamoService {


    public Prestamo findOne(String isbn);
    public Prestamo save (Prestamo prestamo);

}
