package com.example.cursosvirtuales.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name = "profesores")
@Entity
@NamedQueries({
        @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
        , @NamedQuery(name = "Profesor.findByIdProfesor", query = "SELECT p FROM Profesor p WHERE p.idProfesor = :idProfesor")
        , @NamedQuery(name = "Profesor.findByNombre", query = "SELECT p FROM Profesor p WHERE p.nombre = :nombre")
        , @NamedQuery(name = "Profesor.findByApellido", query = "SELECT p FROM Profesor p WHERE p.apellido = :apellido")
        , @NamedQuery(name = "Profesor.findByEmail", query = "SELECT p FROM Profesor p WHERE p.email = :email")
        , @NamedQuery(name = "Profesor.findByContraseña", query = "SELECT p FROM Profesor p WHERE p.contraseña = :contraseña")})

public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfesor", nullable = false)
    private int idProfesor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "contraseña")
    private String contraseña;
}
