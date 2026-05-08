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
    @Column(name = "apellido",nullable = false)
    private String lastName;
    @Column(name = "correo",unique = true,nullable = false)
    private String email;
    @Column(name = "pass",nullable = false)
    private String password;
    @Transient
    private int phone;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_perfil")
    private Profile profile;


    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(String name, String lastName, String email, String password, Profile profile) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public User(String name, String lastName, String email, String password, int phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public void showData(){
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
    }
}
