package org.example.model;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Garaje {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "plazas")
    private int numeroPlazas;

    @Embedded
    private Direccion direccion;

    public Garaje(int numeroPlazas, Direccion direccion) {
        this.numeroPlazas = numeroPlazas;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "id=" + id +
                ", numeroPlazas=" + numeroPlazas +
                ", direccion=" + direccion +
                '}';
    }
}
