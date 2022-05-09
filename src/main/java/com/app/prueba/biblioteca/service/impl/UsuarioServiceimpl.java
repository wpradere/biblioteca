package com.app.prueba.biblioteca.service.impl;

import com.app.prueba.biblioteca.entity.Usuario;
import com.app.prueba.biblioteca.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceimpl implements UsuarioService {
    @Override
    public List<Usuario> findAll() {
        return null;
    }
}
