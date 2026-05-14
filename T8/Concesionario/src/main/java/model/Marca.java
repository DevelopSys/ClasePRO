package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (unique = true, length = 100)
    private String marca;
    @Column
    private String detalle;

    @OneToMany(mappedBy = "marca")
    private List<Coche> coches;

    public Marca(String marca, String detalle) {
        this.marca = marca;
        this.detalle = detalle;
    }
}
