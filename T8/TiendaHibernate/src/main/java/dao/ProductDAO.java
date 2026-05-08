package dao;

import database.HibernateUtil;
import model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public ProductDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertProducts(List<Product> list) {

        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        list.forEach(item ->
        {
            session.persist(item);
        });

        transaction.commit();
        session.close();

    }

    // un usuario compra un producto
        // reducir stock
    // un producto cambia de precio

    // un usuario compra un producto
        // saldo -> reduce el precio del producto

    // eliminar un producto

    // tercera tabla para poder comprar un producto

}
