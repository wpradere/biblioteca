package com.app.prueba.biblioteca.repository;

import com.app.prueba.biblioteca.model.entity.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro,Long> {

    public List<Libro> findByIdLibro(Long id);
    public Libro findByIsbn(String isbn);

}
