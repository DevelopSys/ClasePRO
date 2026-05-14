package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @OneToMany (mappedBy = "estadp")
    private List<Coche> listaCoches;

    public Estado(String nombre) {
        this.nombre = nombre;
    }
}
