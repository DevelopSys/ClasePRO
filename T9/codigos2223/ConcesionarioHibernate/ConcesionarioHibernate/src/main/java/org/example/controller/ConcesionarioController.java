package org.example.controller;

import org.example.database.HibernateUtil;
import org.example.model.Vehiculo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ConcesionarioController {

    private SessionFactory sessionFactory;

    public ConcesionarioController(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void agregarCoche(Vehiculo coche){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(coche);
        session.getTransaction().commit();
        session.close();
    }

    public void getCoches(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Vehiculo> lista = session.createNativeQuery("SELECT")
                .setPa
                .list();
    }


    // metodo que permita agregar un coche



}
