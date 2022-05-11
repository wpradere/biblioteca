package com.app.prueba.biblioteca.service.impl;

import com.app.prueba.biblioteca.model.entity.Prestamo;
import com.app.prueba.biblioteca.repository.PrestamoRepository;
import com.app.prueba.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public Prestamo findOne(String isbn) {
        return prestamoRepository.findByIsbn(isbn);
    }

    @Override
    public Prestamo save(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }


}
