package dao;

import database.HibernateUtil;
import model.Coche;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CocheDAO {

    private Transaction transaction;
    private Session session;
    private SessionFactory sessionFactory;

    public void insertarCoche(Coche coche){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        session.persist(coche);
        transaction.commit();
        session.close();
    }
}
