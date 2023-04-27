package com.example.cursosvirtuales.services;

import com.example.cursosvirtuales.entities.Estudiante;
import com.example.cursosvirtuales.entities.Inscripcion;
import com.example.cursosvirtuales.entities.Profesor;
import com.example.cursosvirtuales.repositories.ProfesorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;


    public Profesor crear(Profesor profesor) {
        profesor.setIdProfesor(0);
        return profesorRepository.save(profesor);
    }

    public List<Profesor> buscarTodoProfesor(){
        return(List<Profesor>) profesorRepository.findAll();
    }

    public Profesor buscarPorIdProfesor(Integer id) {
        return profesorRepository.findById(id).get();
    }

    public Profesor actualizarProfesor(Profesor actualizarProfesor) {
        Profesor actualizarProfe = profesorRepository.findById(actualizarProfesor.getIdProfesor()).get();
        actualizarProfe.setIdProfesor(actualizarProfesor.getIdProfesor());
        actualizarProfe.setNombre(actualizarProfesor.getNombre());
        actualizarProfe.setApellido(actualizarProfesor.getApellido());
        actualizarProfe.setContraseña(actualizarProfesor.getContraseña());
        actualizarProfe.setEmail(actualizarProfesor.getEmail());

        Profesor nuevoProfesor = profesorRepository.save(actualizarProfe);
        return nuevoProfesor;
    }

    public void eliminarProfesor(Integer id) {
        profesorRepository.deleteById(id);
    }

}
