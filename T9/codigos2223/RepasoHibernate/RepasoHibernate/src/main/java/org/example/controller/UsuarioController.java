package org.example.controller;

import org.example.database.HibernateUtil;
import org.example.model.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.ResultSet;
import java.util.List;

public class UsuarioController {

    SessionFactory sessionFactory;

    public UsuarioController() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertarUsuario(Usuario usuario) {
        Session session = sessionFactory.openSession();
        //session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.persist(usuario);
        session.getTransaction().commit();
        session.close();
    }

    public void obtenerDatos(int id) {
        Session session = sessionFactory.openSession();
        //session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Usuario usuario = session.get(Usuario.class, id);
        System.out.println(usuario);
        session.getTransaction().commit();
        session.close();
    }

    public void obtenerLogin(String nombre, String pass) {

        Session session = sessionFactory.openSession();
        //session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Usuario> lista = session.createNativeQuery(
                        String.format("SELECT * FROM usuarios WHERE nombre=:nombre AND password=:pass"
                                , nombre, pass), Usuario.class)
                .setParameter("nombre", nombre)
                .setParameter("pass", pass).list();


        for (Usuario usuario: lista) {
            System.out.println(usuario);
        }

        /*if (lista.size() == 1) {
            System.out.println("Login correcto");
        } else {
            System.out.println("error");
        }*/
        session.getTransaction().commit();
        session.close();

    }
}
