package com.examenT2.LP2_T2_AGUIRRE_MANUEL.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class ProveedorAguirreManuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;
    
    private String ruc;
    
    private String razon_social;
    
    private LocalDate fecha_registro;
    
    private String direccion; // Corregido: faltaba el tipo de dato
    
    private String pagina_web;

    @ManyToOne
    @JoinColumn(name = "id_rubro")
    private RubroAguirreManuel rubro;

    // Constructor vacío (obligatorio para JPA)
    public ProveedorAguirreManuel() {
    }

    // Getters y Setters
    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }

    public RubroAguirreManuel getRubro() {
        return rubro;
    }

    public void setRubro(RubroAguirreManuel rubro) {
        this.rubro = rubro;
    }
}