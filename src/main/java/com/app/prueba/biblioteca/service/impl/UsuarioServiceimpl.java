package com.app.prueba.biblioteca.service.impl;

import com.app.prueba.biblioteca.model.entity.Usuario;
import com.app.prueba.biblioteca.repository.UsuarioRepository;
import com.app.prueba.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceimpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    public Usuario findOneUser(String identificacion) {
        return usuarioRepository.findByIdentificacionUsuario(identificacion);
    }
}
