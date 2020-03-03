package com.user.demo.com.user.demo.controller;

import com.user.demo.com.user.demo.dto.empleadoDTO;
import com.user.demo.com.user.demo.dto.userDTO;
import com.user.demo.com.user.demo.entidades.Empleados;
import com.user.demo.com.user.demo.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAdminController {
    private final UserAdminService userAdminService;

@Autowired public  UserAdminController(UserAdminService userAdminService){
    this.userAdminService = userAdminService;
}


    @GetMapping("/say")
    public Integer helloWorld(@RequestParam Integer id){

        return userAdminService.getUser(id);

    }

    @GetMapping("/agregarEmpleado")
    public Integer agregarEmpleado(@RequestParam empleadoDTO empleadoDTO){

        return userAdminService.agregarEmpleado(empleadoDTO);

    }

    @GetMapping("/eliminarEmpleado")
    public Integer eliminarEmpleado(@RequestParam empleadoDTO empleadoDTO){

        return userAdminService.eliminarEmpleado(empleadoDTO);

    }

    @GetMapping("/actualizarEmpleado")
    public Integer actualizarEmpleado(@RequestParam empleadoDTO empleadoDTO){

        return userAdminService.actualizarEmpleado(empleadoDTO);

    }

    @GetMapping("/obtenerListaEmpleados")
    public List<empleadoDTO> obtenerListaEmpleados(){

        return userAdminService.obtenerListaEmpleados();

    }



}
