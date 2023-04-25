package com.example.cursosvirtuales.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Table(name = "inscripciones")
@Entity
@NamedQueries({
        @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i")
        , @NamedQuery(name = "Inscripcion.findByidInscripcion", query = "SELECT i FROM Inscripcion i WHERE i.idInscripcion = :idInscripcion")
})

public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "idInscripcion")
    private int idInscripcion;

    @JoinColumn(name = "idEstudiante", referencedColumnName = "idEstudiante")
    @ManyToOne(optional = false)
    private Estudiante estudiante;

    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false)
    private Curso curso;

}
