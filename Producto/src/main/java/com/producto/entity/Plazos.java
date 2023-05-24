package com.producto.entity;

import javax.persistence.*;

@Entity
@Table(name = "plazos")
public class Plazos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plazo")
    private Integer idPlazo;
    @Column(name = "duracion_semanas")
    private Integer duracionSemanas;
    @Column(name = "tasa_normal")
    private double tasaNormal;
    @Column(name = "tasa_puntual")
    private double tasaPuntual;

    public Plazos() {
    }

    public Plazos(Integer idPlazo, Integer duracionSemanas, double tasaNormal, double tasaPuntual) {
        this.idPlazo = idPlazo;
        this.duracionSemanas = duracionSemanas;
        this.tasaNormal = tasaNormal;
        this.tasaPuntual = tasaPuntual;
    }

    public Integer getIdPlazo() {
        return idPlazo;
    }

    public void setIdPlazo(Integer idPlazo) {
        this.idPlazo = idPlazo;
    }

    public Integer getDuracionSemanas() {
        return duracionSemanas;
    }

    public void setDuracionSemanas(Integer duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public double getTasaNormal() {
        return tasaNormal;
    }

    public void setTasaNormal(double tasaNormal) {
        this.tasaNormal = tasaNormal;
    }

    public double getTasaPuntual() {
        return tasaPuntual;
    }

    public void setTasaPuntual(double tasaPuntual) {
        this.tasaPuntual = tasaPuntual;
    }

    @Override
    public String toString() {
        return "Plazos{" +
                "idPlazo=" + idPlazo +
                ", duracionSemanas=" + duracionSemanas +
                ", tasaNormal=" + tasaNormal +
                ", tasaPuntual=" + tasaPuntual +
                '}';
    }
}