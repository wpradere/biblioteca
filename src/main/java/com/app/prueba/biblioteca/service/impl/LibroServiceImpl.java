package com.app.prueba.biblioteca.service.impl;

import com.app.prueba.biblioteca.entity.Libro;
import com.app.prueba.biblioteca.repository.LibroRepository;
import com.app.prueba.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findOne(Long id) {
        return libroRepository.findByIdLibro(id);
    }
}
