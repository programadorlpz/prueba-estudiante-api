package com.gradle.controller;

import com.gradle.entity.PruebaEstudiante;
import com.gradle.service.PruebaEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class PruebaEstudianteController {

    @Autowired
    private PruebaEstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<PruebaEstudiante>> getAllEstudiantes() {
        return ResponseEntity.ok(estudianteService.getAllEstudiantes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PruebaEstudiante> getEstudianteById(@PathVariable Long id) {
        return ResponseEntity.ok(estudianteService.getEstudianteById(id));
    }

    @PostMapping
    public ResponseEntity<PruebaEstudiante> createEstudiante(@RequestBody PruebaEstudiante estudiante) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteService.createEstudiante(estudiante));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PruebaEstudiante> updateEstudiante(@PathVariable Long id, @RequestBody PruebaEstudiante estudiante) {
        return ResponseEntity.ok(estudianteService.updateEstudiante(id, estudiante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Long id) {
        estudianteService.deleteEstudiante(id);
        return ResponseEntity.noContent().build();
    }
}
