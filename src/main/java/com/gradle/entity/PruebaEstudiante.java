package com.gradle.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pruebaestudiante")
public class PruebaEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String especialidad;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false)
    private String horario;

    // Constructor por defecto
    public PruebaEstudiante() {}

    // Constructor con parámetros
    public PruebaEstudiante(Long id, String nombre, String especialidad, int edad, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.horario = horario;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
}
