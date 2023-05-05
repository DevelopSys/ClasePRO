package org.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_motor")
    private Motor motor;
    @Column
    private int precio;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ficha")
    private Ficha ficha;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "id_cliente")
    private Cliente cliente;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "id_garaje")
    private Garaje garaje;

    public Vehiculo(String marca, String modelo, Motor motor, int precio, Ficha ficha, Cliente cliente, Garaje garaje) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.ficha = ficha;
        this.cliente = cliente;
        this.garaje = garaje;
    }

    public Vehiculo(String marca, String modelo, Motor motor, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, Motor motor, int precio, Ficha ficha) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.ficha = ficha;
    }

    public Vehiculo(String marca, String modelo, Motor motor, int precio, Ficha ficha, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.ficha = ficha;
        this.cliente = cliente;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }

    public Vehiculo() {
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
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
                ", ficha=" + ficha +
                ", cliente=" + cliente +
                ", garaje=" + garaje +
                '}';
    }
}
