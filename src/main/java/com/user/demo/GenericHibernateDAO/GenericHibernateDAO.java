package com.user.demo.GenericHibernateDAO;

import org.hibernate.Session;

import java.io.Serializable;

public interface GenericHibernateDAO {



    <T> int actualizarEntidad(T entidad);


    <T extends Serializable> int guardarEntidad(T entidad);



    <T> int eliminarEntidad(T entidad);



    <T> T get(Class<T> clazz, Serializable id);


    public Session getCurrentSession();


}
