package com.app.prueba.biblioteca.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;

    @Column(name = "prestamo_isbn",unique = true)
    private String isbn;

    @Column(name = "create_at")
    private LocalDate creatAt;

    @Column(name = "dia_entrega")
    private LocalDate diaEntrega;

    @Column(name = "estado_prestamo")
    private boolean estadoPrestamo=true;

    @Column(name = "tipo_usuario")
    private int tipoUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    private Libro libro;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;


    public LocalDate getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(LocalDate diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public LocalDate getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDate creatAt) {
        this.creatAt = creatAt;
    }
}
