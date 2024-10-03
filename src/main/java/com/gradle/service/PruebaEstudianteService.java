package com.gradle.service;

import com.gradle.entity.PruebaEstudiante;

import java.util.List;

public interface PruebaEstudianteService {
    List<PruebaEstudiante> getAllEstudiantes();
    PruebaEstudiante getEstudianteById(Long id);
    PruebaEstudiante createEstudiante(PruebaEstudiante estudiante);
    PruebaEstudiante updateEstudiante(Long id, PruebaEstudiante estudiante);
    void deleteEstudiante(Long id);
}
