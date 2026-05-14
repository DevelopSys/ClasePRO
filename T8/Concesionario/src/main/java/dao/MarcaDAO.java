package dao;

import database.HibernateUtil;
import model.Coche;
import model.Marca;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MarcaDAO {

    private Session session;
    private SessionFactory sessionFactory;
    private Transaction transaction;


    public Marca getMarcaById(int id){
        Marca marca= null;
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        marca = session.find(Marca.class,id);
        transaction.commit();
        session.close();
        return marca;
    }

    public List<Coche> getAllCochesFromMarca(String marcaStr){

        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Marca marca = session
                .createQuery("FROM Marca m WHERE m.marca= :nombre",Marca.class)
                .setParameter("nombre",marcaStr)
                .getSingleResult();

        transaction.commit();
        session.close();

        return marca.getCoches();
    }
}
