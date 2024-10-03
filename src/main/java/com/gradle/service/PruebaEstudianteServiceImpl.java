package com.gradle.service;

import com.gradle.entity.PruebaEstudiante;
import com.gradle.exception.ResourceNotFoundException;
import com.gradle.repository.PruebaEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PruebaEstudianteServiceImpl implements PruebaEstudianteService {

    @Autowired
    private PruebaEstudianteRepository estudianteRepository;

    @Override
    public List<PruebaEstudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public PruebaEstudiante getEstudianteById(Long id) {
        return estudianteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrado con id " + id));
    }

    @Override
    public PruebaEstudiante createEstudiante(PruebaEstudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public PruebaEstudiante updateEstudiante(Long id, PruebaEstudiante estudiante) {
        PruebaEstudiante existingEstudiante = getEstudianteById(id);
        existingEstudiante.setNombre(estudiante.getNombre());
        existingEstudiante.setEspecialidad(estudiante.getEspecialidad());
        existingEstudiante.setEdad(estudiante.getEdad());
        existingEstudiante.setHorario(estudiante.getHorario());
        return estudianteRepository.save(existingEstudiante);
    }

    @Override
    public void deleteEstudiante(Long id) {
        PruebaEstudiante estudiante = getEstudianteById(id);
        estudianteRepository.delete(estudiante);
    }
}
