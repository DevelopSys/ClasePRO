package org.example.model;

import jakarta.persistence.*;

@Entity
@Table
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Embedded
    private Motor motor;
    @Column
    private int precio;
    @OneToMany
    @JoinColumn (name = "id")
    private Motor  id_motor;

    public Vehiculo(String marca, String modelo, Motor motor, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
    }

    public Vehiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", precio=" + precio +
                '}';
    }
}
