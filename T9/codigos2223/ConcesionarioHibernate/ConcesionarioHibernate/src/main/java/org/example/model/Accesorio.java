package org.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Accesorio {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private int precio;
    @ManyToMany (mappedBy = "listaAccesorios")
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public void addVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
        vehiculo.getListaAccesorios().add(this);
    }


}
