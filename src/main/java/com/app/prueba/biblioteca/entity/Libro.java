package com.app.prueba.biblioteca.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    @Column(name = "isnb",unique = true)
    private String isnb;

    @Column(name = "nombre_libro")
    private String nombreLibro;

    @Column(name = "estado_libro")
    private boolean estadoLibro=false;

    public Long getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
}
