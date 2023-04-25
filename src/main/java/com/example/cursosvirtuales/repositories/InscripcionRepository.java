package com.example.cursosvirtuales.repositories;

import com.example.cursosvirtuales.entities.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface InscripcionRepository extends JpaRepository<Inscripcion, Integer> {
}
