package com.gradle.repository;

import com.gradle.entity.PruebaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PruebaEstudianteRepository extends JpaRepository<PruebaEstudiante, Long> {
    List<PruebaEstudiante> findByEspecialidad(String especialidad);
    List<PruebaEstudiante> findByHorario(String horario);
}
