package model;

import jakarta.persistence.*;
import lombok.Data;

// Cuidado con el data que es peligroso en capas superiores
@Data
@Entity
@Table (name = "coches")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String matriculia;

    // TODO cambiar a base de datos
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    @Column
    private String modelo;
    @Column
    private String color;

    // TODO cambiar a base de datos
    @ManyToOne
    @JoinColumn(name = "id_combustible")
    private Combustible combustible;

    @Column
    private int anio;
    @Column
    private int km;
    @Column
    private int precio;

    // TODO cambiar a base de datos
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estadp;

    public Coche(String matriculia, Marca marca, String modelo, String color, Combustible combustible, int anio, int km, int precio, Estado estadp) {
        this.matriculia = matriculia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.anio = anio;
        this.km = km;
        this.precio = precio;
        this.estadp = estadp;
    }
}
