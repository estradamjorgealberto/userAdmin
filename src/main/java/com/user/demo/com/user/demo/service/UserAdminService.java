package com.user.demo.com.user.demo.service;


import com.user.demo.com.user.demo.dto.empleadoDTO;
import com.user.demo.com.user.demo.entidades.Empleados;

import java.util.List;

public interface UserAdminService {

    int getUser(Integer id);

    int agregarEmpleado(empleadoDTO empleadoDTO);

    int eliminarEmpleado(empleadoDTO empleadoDTO);

    int actualizarEmpleado(empleadoDTO empleadoDTO);

    List<empleadoDTO> obtenerListaEmpleados();


}
