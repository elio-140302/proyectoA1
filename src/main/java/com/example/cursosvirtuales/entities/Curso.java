package com.example.cursosvirtuales.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "cursos")
@NamedQueries({
        @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
        , @NamedQuery(name = "Curso.findByIdCurso", query = "SELECT c FROM Curso c WHERE c.idCurso = :idCurso")
        , @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre")
        , @NamedQuery(name = "Curso.findByFechaInicio", query = "SELECT c FROM Curso c WHERE c.fechaInicio = :fechaInicio")
        , @NamedQuery(name = "Curso.findByFechaFinalizacion", query = "SELECT c FROM Curso c WHERE c.fechaFinalizacion = :fechaFinalizacion")})



public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCurso")
    private int idCurso;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaInicio")
    private Date fechaInicio;

    @Column(name = "fechaFinalizacion")
    private Date fechaFinalizacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso", fetch = FetchType.LAZY)
    @JsonBackReference(value="curso_insc")
    private List<Inscripcion> inscripcionList;

    @JoinColumn(name = "idProfesor", referencedColumnName = "idProfesor")
    @ManyToOne(optional = false)
    private Profesor profesor;

}
