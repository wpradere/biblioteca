package com.app.prueba.biblioteca.Controller;

import com.app.prueba.biblioteca.entity.Libro;
import com.app.prueba.biblioteca.entity.Prestamo;
import com.app.prueba.biblioteca.entity.Usuario;
import com.app.prueba.biblioteca.service.LibroService;
import com.app.prueba.biblioteca.service.PrestamoService;
import com.app.prueba.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app/biblioteca/")
public class PrestamoController {


    @Autowired
    private PrestamoService prestamoService;

    @Autowired
    private LibroService libroService;

    @Autowired
    private UsuarioService usuarioService;





    @GetMapping("/all")
    public List<Prestamo> findAll(){
/*
        List<Prestamo> listap = prestamoService.findAll();
        System.out.println(listap.g);*/

        return prestamoService.find();
    }

    @PostMapping("/prestamo")
    public String prestamoLibro(@RequestBody Prestamo prestamo){
        String respuesta=null;

        Prestamo prestamoTranasaccion = prestamoService.findOne(prestamo.getIsnb());
        Usuario usuarioTransaccion = prestamoTranasaccion.getUsuario();
        Libro libroTransaccion=prestamoTranasaccion.getLibro();

        if (usuarioTransaccion.getTipoUsuario()==1){
           respuesta ="mensaje : El usuario con identificación"+"  "+ usuarioTransaccion.getIdentificacionUsuario()+" "+"ya tiene un libro prestado por lo cual no se le puede realizar otro préstamo";
        }

        System.out.println(usuarioTransaccion.getNombre());

        return respuesta;
    }
}
