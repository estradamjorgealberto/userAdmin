package com.user.demo.com.user.demo.daoImpl;

import com.user.demo.com.user.demo.dao.userAdminDAO;
import com.user.demo.com.user.demo.dto.empleadoDTO;
import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("personalDAO")
public class userAdminDAOImpl implements userAdminDAO {


    @Override
    public int getUser(Integer id) {
        if(id == 1){
            return 1 ;
        }else{
            return id;
        }


    }

    @Override
    public List<empleadoDTO> obtenerListaEmpleados() {


        // language=MySQL
        String QUERY = "" +
                " SELECT " +
                " empleados.EMPLEADO_ID AS  empleadoId ," +
                " empleados.NOMBRE AS  apellPaterno ," +
                " empleados.APELL_PATERNO AS  apellMaterno ," +
                " empleados.APELL_MATERNO AS  direccion ," +
                " empleados.DIRECCION AS  telefono " +


                "FROM Empleados empleados"                ;

        Query query = getCurrentSession().createSQLQuery(QUERY)
                .addScalar("empleadoId ", StandardBasicTypes.INTEGER)
                .addScalar("apellPaterno ", StandardBasicTypes.STRING)
                .addScalar("apellMaterno ", StandardBasicTypes.STRING)
                .addScalar("direccion ", StandardBasicTypes.INTEGER)
                .addScalar("telefono ", StandardBasicTypes.STRING);

        query.setResultTransformer(Transformers.aliasToBean(empleadoDTO.class));

        return query.list();


    }
}
