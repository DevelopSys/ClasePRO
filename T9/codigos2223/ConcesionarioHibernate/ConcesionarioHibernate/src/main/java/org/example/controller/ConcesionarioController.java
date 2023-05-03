package org.example.controller;

import org.example.database.HibernateUtil;
import org.example.model.Cliente;
import org.example.model.Ficha;
import org.example.model.Motor;
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
        //session.persist(coche.getFicha());
        session.persist(coche);
        session.getTransaction().commit();
        session.close();
    }

    // sacar todos los coches de un cliente cuyo nombre se
    // pide por consola
    // de que cliente quieres ver los coches
    // Juan
    // Juan tiene 4 coches y son;
    // DATOS DE LOS COCHES
    public void agregarCocheFicha(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // session.persist(coche.getFicha());
        // Ficha ficha = new Ficha(2023,2,true,'A');
        Vehiculo vehiculo = new Vehiculo("VW","Arteon",
                new Motor(3000,350),
                30000,new Ficha(2022,5,true,'B'));
        session.persist(vehiculo);
        session.getTransaction().commit();
        session.close();
    }
    public void agregarCocheFichaMotor(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Vehiculo vehiculo = new Vehiculo("VW","TROC",
                new Motor(2000,150),
                40000,
                new Ficha(2023,1,false,'C')
        );
        session.persist(vehiculo);
        session.getTransaction().commit();
        session.close();
    }

    public void agregarCocheFichaMotorCliente(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Vehiculo vehiculo = new Vehiculo("Opel","Astra",
                new Motor(1500,100),
                15000,
                new Ficha(2023,1,true,'A'),
                new Cliente("Borja","C/Estocolmo"));

        session.persist(vehiculo);
        session.getTransaction().commit();
        session.close();
    }

    public void getVehiculoFicha(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Ficha ficha = session.get(Ficha.class,1);
        System.out.println(ficha);
        session.getTransaction().commit();
        session.close();
    }

    public void obtenerVehiculo()
    {
        // 1. crear session
        Session session = sessionFactory.openSession();
        // 2. inicio transaccion
        session.beginTransaction();
        // 3. hacer la peticion - get
        Vehiculo vehiculo = session.get(Vehiculo.class,3);
        session.getTransaction().commit();
        System.out.println(vehiculo);
        session.close();
    }

    public void borrarVehiculo(){
        // 1. crear session
        Session session = sessionFactory.openSession();
        // 2. inicio transaccion
        session.beginTransaction();
        // 3. hacer la peticion - remove / delete
        //Vehiculo vehiculo = session.get(Vehiculo.class,3);
        //System.out.println(vehiculo);
        Vehiculo vehiculo = session.get(Vehiculo.class,1);
        session.remove(vehiculo);
        session.getTransaction().commit();
        session.close();
    }

    public void modificarVehiculo(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // 1. obtener el objeto
        Vehiculo vehiculo = session.get(Vehiculo.class,2);
        // 2. utilizar los seter para modificar los datos
        vehiculo.setPrecio(50000);
        session.update(vehiculo);
        session.getTransaction().commit();
        session.close();
    }

    public void modificarPrecio(Vehiculo v, int precio){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        v.setPrecio(precio);
        session.update(v);
        session.getTransaction().commit();
        session.close();
    }

    public void realizarBusquedaMarca(String marca){
        // Query -> HQL
        // NativeQuery -> SQLwsd%9339

            // posicionales
            // nominales
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // "SELECT * FROM vehiculo WHERE marca = '"+marca+"'"
        List<Vehiculo> listaResultado =
                session.createNativeQuery("SELECT * FROM vehiculo WHERE marca = :pmarca", Vehiculo.class)
                        .setParameter("pmarca",marca)
                        .list();
        for ( Vehiculo vehiculo :listaResultado) {
            //System.out.println(vehiculo);
            modificarPrecio(vehiculo,20000);
        }
        //System.out.println(listaResultado.size());
        session.getTransaction().commit();


    }


    // metodo que permita agregar un coche



}
