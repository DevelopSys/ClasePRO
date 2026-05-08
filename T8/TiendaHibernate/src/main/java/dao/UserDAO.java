package dao;

import database.HibernateUtil;
import model.Profile;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAO {
    // quiero ir contra base de datos

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public UserDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertUser(User user) {
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
        } catch (Exception e) {
            System.out.println("error en la transaccion");
            System.out.println(e.getMessage());
            transaction.rollback();
        } finally {
            session.close();
        }

    }

    public User getUserById(int id) {

        User user = null;
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        user = session.find(User.class, id);
        // user = session.find(User.class,id);
        transaction.commit();
        session.close();
        return user;
    }

    public List<User> getUserByName(String name) {


        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        List<User> users = session.createQuery("FROM User u WHERE u.name = :paramName", User.class)
                .setParameter("paramName", name).getResultList();

        transaction.commit();
        session.close();

        return users;

    }

    public User updateUserByLastNameAndName
            (String name, String lastName, String newMail) {
        // OBTENER EL USUARIO CON NOMBRE Y APELLIDO SON LOS PASADOS
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        User user = session
                .createQuery("FROM User u WHERE u.name = :name AND u.lastName = :lastName", User.class)
                .setParameter("name", name)
                .setParameter("lastName", lastName).getSingleResult();
        if (user != null){
            user.setEmail(newMail);
        }

        transaction.commit();
        session.close();

        return user;
    }

    public List<User> getUsersByProfile(int id){
        List<User> lista = null;
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        Profile profile = session.find(Profile.class,id);
        if(profile != null){
            lista = profile.getUsers();
        }

        transaction.commit();
        session.close();
        return lista;
    }




}
