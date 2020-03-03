package com.user.demo.com.user.demo.dao;

import com.user.demo.GenericHibernateDAO.GenericHibernateDAO;
import com.user.demo.com.user.demo.dto.empleadoDTO;

import java.util.List;

public interface userAdminDAO extends GenericHibernateDAO {

    int getUser(Integer Id);
    List<empleadoDTO> obtenerListaEmpleados();

}
