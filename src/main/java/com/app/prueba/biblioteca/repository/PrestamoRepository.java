package com.app.prueba.biblioteca.repository;

import com.app.prueba.biblioteca.model.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrestamoRepository extends CrudRepository<Prestamo,Long> {

    public Prestamo findByIsbn(String isbn);
    <S extends Prestamo> S save(S entity);

}
