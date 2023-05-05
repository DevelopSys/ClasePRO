package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Embedded
    private Direccion direccion;
    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "localidad", column = @Column(name = "localidad_fac")),
            @AttributeOverride(name = "provincia", column = @Column(name = "provincia_fac")),
            @AttributeOverride(name = "calle", column = @Column(name = "calle_fac")),
            @AttributeOverride(name = "numero", column = @Column(name = "numero_fac"))})
    private Direccion direccionFacturacion;

    @OneToMany (mappedBy = "cliente")
    private List<Vehiculo> listaVehiculos;

    public Cliente() {
    }

    public Cliente(String nombre, Direccion direccion, Direccion direccionFacturacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.direccionFacturacion = direccionFacturacion;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Cliente(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                ", listaVehiculos=" + listaVehiculos.size() +
                '}';
    }
}
