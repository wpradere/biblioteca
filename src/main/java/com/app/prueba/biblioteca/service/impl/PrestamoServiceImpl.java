package com.app.prueba.biblioteca.service.impl;

import com.app.prueba.biblioteca.entity.Prestamo;
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
    public List<Prestamo> find() {
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo findOne(String isnb) {
        return prestamoRepository.findByIsnb(isnb);
    }

}
