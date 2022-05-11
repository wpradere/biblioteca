package com.app.prueba.biblioteca.Controller;


import com.app.prueba.biblioteca.dto.Rqprestamo;
import com.app.prueba.biblioteca.model.entity.Libro;
import com.app.prueba.biblioteca.model.entity.Prestamo;
import com.app.prueba.biblioteca.model.entity.Usuario;
import com.app.prueba.biblioteca.service.LibroService;
import com.app.prueba.biblioteca.service.PrestamoService;
import com.app.prueba.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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


    @PostMapping("/prestamo")
    public ResponseEntity<?> prestamoLibro(@RequestBody Rqprestamo rqprestamo) {
        String respuesta;
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String fechaFormato = formato.format(fechaActual);

        int i = 0, diaInicial, diasFaltantes, val, diaAfiliado, diasTotales = 0;

        //System.out.println(rqprestamo.getIsbn());
        //System.out.println(rqprestamo.getIdentificacionUsuario());
        //System.out.println(rqprestamo.getTipoUsuario());

        if (prestamoService.findOne(rqprestamo.getIsbn()) != null) {
            Prestamo prestamoTranasaccion = prestamoService.findOne(rqprestamo.getIsbn());
            Usuario usuarioTransaccion = prestamoTranasaccion.getUsuario();

            if (prestamoTranasaccion.getTipoUsuario() == 1 && usuarioTransaccion.getIdentificacionUsuario() != null) {
                respuesta = "mensaje : El usuario con identificación" + "  " + usuarioTransaccion.getIdentificacionUsuario() + " " + "ya tiene un libro prestado por lo cual no se le puede realizar otro préstamo";
                return new ResponseEntity(respuesta, HttpStatus.NOT_FOUND);
            } else if (usuarioTransaccion.getIdentificacionUsuario() != null) {
                respuesta = "usuario ya tiene un prestamo";
            }
        } else {
            if ( libroService.findOneLibro(rqprestamo.getIsbn())==null || usuarioService.findOneUser(rqprestamo.getIdentificacionUsuario())== null ){
                respuesta = "usuario con el id : " + rqprestamo.getIdentificacionUsuario() + "  " + " o el libro con el numero isbn " + rqprestamo.getIsbn() + " " + "no existe ";
                return new ResponseEntity(respuesta,HttpStatus.OK);
            }

            Libro libroNew = libroService.findOneLibro(rqprestamo.getIsbn());
            Usuario usuarioNew = usuarioService.findOneUser(rqprestamo.getIdentificacionUsuario());

            Prestamo prestamoNew = new Prestamo();

            if (rqprestamo.getTipoUsuario() == 1) {
                System.out.println(fechaFormato);
                prestamoNew.setCreatAt(fechaActual);
                diaAfiliado = 10;
                while (i <= diaAfiliado) {
                    val = fechaActual.plusDays(i).getDayOfWeek().getValue();
                    if (val == 6 || val == 7) {
                        diaAfiliado = diaAfiliado + 1;
                    }
                    i++;
                }

                System.out.println("datttttt" + usuarioNew.getIdUsuario());
                prestamoNew.setDiaEntrega(fechaActual.plusDays(diaAfiliado));
                prestamoNew.setTipoUsuario(rqprestamo.getTipoUsuario());
                prestamoNew.setUsuario(usuarioNew);
                prestamoNew.setLibro(libroNew);
                prestamoNew.setIsbn(libroNew.getIsbn());


                prestamoService.save(prestamoNew);

                System.out.println("se guardo el usuario");


            } else if (rqprestamo.getTipoUsuario() == 2) {

            } else if (rqprestamo.getTipoUsuario() == 3) {

            }

        }

        respuesta = "usuario con el id : " + rqprestamo.getIdentificacionUsuario() + "  " + " o el libro con el numero isbn " + rqprestamo.getIsbn() + " " + "no existe ";

        return new ResponseEntity(respuesta, HttpStatus.OK);
    }
}
