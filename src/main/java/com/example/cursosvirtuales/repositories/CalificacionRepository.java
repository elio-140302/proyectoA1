package com.example.cursosvirtuales.repositories;

import com.example.cursosvirtuales.entities.Calificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepository extends CrudRepository<Calificacion, Integer> {

}
