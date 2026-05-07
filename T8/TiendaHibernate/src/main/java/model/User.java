package model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false)
    private String name;
    @Column(name = "correo",unique = true,nullable = false)
    private String email;
    @Column(name = "pass",nullable = false)
    private String password;
    @Transient
    private int phone;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password, int phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }
}
