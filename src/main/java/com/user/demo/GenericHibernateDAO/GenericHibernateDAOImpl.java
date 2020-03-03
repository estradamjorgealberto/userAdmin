package com.user.demo.GenericHibernateDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionImplementor;

import javax.annotation.Resource;
import java.io.Serializable;
import java.sql.Connection;

public abstract class GenericHibernateDAOImpl implements GenericHibernateDAO {

    @Resource
    private SessionFactory sessionFactory;

    public <T> T get(Class<T> clazz, Serializable id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public final Session getCurrentSession() {

        return sessionFactory.getCurrentSession();
    }



    public void save(Serializable entity) {
        getCurrentSession().save(entity);
    }


    public void saveOrUpdate(Serializable entity) {
        getCurrentSession().saveOrUpdate(entity);
    }


    public <T> T merge(final T entity) {
        return (T) getCurrentSession().merge(entity);
    }


    protected final Connection getCurrentConnection() {

        SessionImplementor sim = (SessionImplementor) sessionFactory.getCurrentSession();
        return sim.connection();
    }


    public void flush() {
        sessionFactory.getCurrentSession().flush();

    }





    public <T extends Serializable> int guardarEntidad(T entidad) {
        try {
            this.save(entidad);
            this.flush();
            return 1;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }





    public <T> int actualizarEntidad(T entidad) {
        try {
            this.merge(entidad);
            this.flush();
            return 1;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }


}
