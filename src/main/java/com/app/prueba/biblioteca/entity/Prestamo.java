package com.app.prueba.biblioteca.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;

    @Column(name = "prestamo_isnb",unique = true)
    private String isnb;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    private Date creatAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "dia_entrega")
    private Date diaEntrega;

    @Column(name = "estado_prestamo")
    private boolean estadoPrestamo=false;

    @ManyToOne(fetch = FetchType.LAZY)
    private Libro libro;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(Date diaEntrega) {
        this.diaEntrega = diaEntrega;
    }
}
