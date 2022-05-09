package com.app.prueba.biblioteca.repository;

import com.app.prueba.biblioteca.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrestamoRepository extends CrudRepository<Prestamo,Long> {

    public List<Prestamo>findAll();
    public Prestamo findByIsnb(String isnb);
}
