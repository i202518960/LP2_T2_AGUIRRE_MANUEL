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
@Table(name = "orden_compra")
public class OrdenCompraAguirreManuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nro_orden;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private ProveedorAguirreManuel proveedor;

    private Double monto;
    
    private String direccion_entrega;
    
    private LocalDate fecha_entrega;
    
    private String estado = "P";

    public OrdenCompraAguirreManuel() {
    }

    public Long getNro_orden() {
        return nro_orden;
    }

    public void setNro_orden(Long nro_orden) {
        this.nro_orden = nro_orden;
    }

    public ProveedorAguirreManuel getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorAguirreManuel proveedor) {
        this.proveedor = proveedor;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


