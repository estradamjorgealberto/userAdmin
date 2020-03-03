package com.user.demo.com.user.demo.com.user.demo.serviceImpl;


import com.user.demo.com.user.demo.dao.userAdminDAO;
import com.user.demo.com.user.demo.dto.empleadoDTO;
import com.user.demo.com.user.demo.entidades.Empleados;
import com.user.demo.com.user.demo.service.UserAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userAdminService")
public class UserAdminServiceImpl implements UserAdminService {

    @Resource
    userAdminDAO userAdminDAO;




    @Override
    public int getUser(Integer id) {
        return userAdminDAO.getUser(id);
    }

    @Override
    public int agregarEmpleado(empleadoDTO empleadoDTO) {

        Empleados empleados = new Empleados();

        empleados.setNombre(empleadoDTO.getNombre());
        empleados.setApellPaterno(empleadoDTO.getApellPaterno());
        empleados.setApellMaterno(empleadoDTO.getApellMaterno());
        empleados.setDireccion(empleadoDTO.getDireccion());
        empleados.setTelefono(empleadoDTO.getTelefono());


        return userAdminDAO.guardarEntidad(empleados);


    }

    @Override
    public int eliminarEmpleado(empleadoDTO empleadoDTO) {

        Empleados empleados = userAdminDAO.get(Empleados.class, empleadoDTO.getEmpleadoId());

        if (empleados != null) {

            return userAdminDAO.eliminarEntidad(empleados);

        } else {

            return 0;

        }


    }


    @Override
    public int actualizarEmpleado(empleadoDTO empleadoDTO) {
        Empleados empleados = userAdminDAO.get(Empleados.class, empleadoDTO.getEmpleadoId());

        if (empleados != null) {

            return userAdminDAO.actualizarEntidad(empleados);

        } else {

            return 0;

        }
    }

    @Override
    public List<empleadoDTO> obtenerListaEmpleados() {


        return userAdminDAO.obtenerListaEmpleados();

    }


}
