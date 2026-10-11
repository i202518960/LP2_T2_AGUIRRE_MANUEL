package com.examenT2.LP2_T2_AGUIRRE_MANUEL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rubro")
public class RubroAguirreManuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rubro;
    
    private String denominacion;

    // Constructor vacío (obligatorio para JPA)
    public RubroAguirreManuel() {
    }

    // Getters y Setters
    public Long getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(Long id_rubro) {
        this.id_rubro = id_rubro;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}