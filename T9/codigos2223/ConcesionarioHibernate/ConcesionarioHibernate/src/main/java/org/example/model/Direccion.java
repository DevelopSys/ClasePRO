package org.example.model;

import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

public class Direccion implements Serializable {

    @Column
    private String provincia;

    @Column
    private String localidad;

    @Column
    private String calle;

    @Column
    private int numero;

    public Direccion(String provincia, String localidad) {
        this.provincia = provincia;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "provincia='" + provincia + '\'' +
                ", localidad='" + localidad + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }
}
