package org.example.controller;

import org.example.database.HibernateUtil;
import org.example.model.Alumno;
import org.example.model.Ciclo;
import org.example.model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ControllerExamen {

    HibernateUtil hibernateUtil;
    SessionFactory sessionFactory;

    public ControllerExamen() {
        hibernateUtil = new HibernateUtil();
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insercionAlumnos(Alumno alumnos){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(alumnos);
        session.getTransaction().commit();
        session.close();

    }

    public void insercionProfesor(Profesor profesor){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Ciclo c = session.createNativeQuery("SELECT * FROM ciclos WHERE nombre = 'DAM'", Ciclo.class).list().get(0);
        profesor.setCiclo(c);
        session.persist(profesor);
        session.getTransaction().commit();
        session.close();

    }

    public void modificarProfesores(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Profesor> listaDoctorados = session.createNativeQuery("SELECT * from profesores WHERE doctorado = true", Profesor.class).list();
        for ( Profesor profesor:listaDoctorados ) {

            profesor.setSueldo(profesor.getSueldo()+1000);
            session.update(profesor);

        }


        session.getTransaction().commit();
        session.close();
    }

    public void getAlumnosMatriculados(){

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Ciclo c = session.get(Ciclo.class,1);
        for (Alumno alumno:c.getListaAlumnos()) {
            System.out.println(alumno.getNombre());
        }

        session.getTransaction().commit();
        session.close();

    }
}
