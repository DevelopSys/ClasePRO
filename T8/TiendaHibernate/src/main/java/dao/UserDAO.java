package dao;

import database.HibernateUtil;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO {
    // quiero ir contra base de datos

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public UserDAO(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertUser(User user){
        // abres la sesion
        try {
        session = sessionFactory.openSession();
        // inicio transaccion
        transaction = session.beginTransaction();
        // accion
        session.persist(user);
            // 1- clase mapeo
                // Tabla
                // columnas - atributos
        // garantizar transaccion
        transaction.commit();
        // cierra la sesion
        } catch (Exception e){
            System.out.println("error en la transaccion");
            System.out.println(e.getMessage());
            transaction.rollback();
        } finally {
            session.close();
        }

    }


}
