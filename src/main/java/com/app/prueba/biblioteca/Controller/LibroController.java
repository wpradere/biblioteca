package com.app.prueba.biblioteca.Controller;

import com.app.prueba.biblioteca.entity.Libro;
import com.app.prueba.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/biblioteca/")
public class LibroController {



    @Autowired
    private LibroService libroService;



    @GetMapping("/libro/{id}")
    public List<Libro> prestamoLibro(@PathVariable Long id){
        return libroService.findOne(id);
    }
}
