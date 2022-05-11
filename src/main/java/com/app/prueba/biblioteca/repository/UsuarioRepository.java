package com.app.prueba.biblioteca.repository;

import com.app.prueba.biblioteca.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

    public List<Usuario> findAll();
    public Usuario findByIdentificacionUsuario(String identificacion);

}
