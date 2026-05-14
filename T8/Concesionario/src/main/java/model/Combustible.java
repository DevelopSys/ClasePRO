package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "combustibles")
public class Combustible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tipo;
    @Column
    private String descripcion;

    @OneToMany (mappedBy = "combustible")
    private List<Coche> listaCoches;

    public Combustible(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
}
