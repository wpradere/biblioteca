package com.app.prueba.biblioteca.Controller;

import com.app.prueba.biblioteca.model.entity.Libro;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/usuario/")
public class UsuarioController {

    @PostMapping("/all")
    public String prestamoLibro(@RequestBody Libro libro){

        System.out.println(libro.getNombreLibro());
        return "data";
    }
}
