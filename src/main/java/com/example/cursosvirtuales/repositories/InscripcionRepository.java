package com.example.cursosvirtuales.repositories;

import com.example.cursosvirtuales.entities.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepository extends CrudRepository<Inscripcion, Integer> {
}
