package com.app.prueba.biblioteca.service;

import com.app.prueba.biblioteca.model.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();
    public Usuario findOneUser(String identificaion);
}
