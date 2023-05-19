package org.example.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "matriculas")
@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int expediente;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "matricula")
    private Alumno alumno;

    public Matricula(int expediente) {
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", expediente=" + expediente +
                ", alumno=" + alumno +
                '}';
    }
}
