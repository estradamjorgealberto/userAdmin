package com.user.demo.com.user.demo.entidades;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleados implements java.io.Serializable {

private Integer empleadoId ;
private String nombre ;
private String apellPaterno;
private String apellMaterno;
private String direccion;
private String telefono;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLEADO_ID", unique = true, nullable = false, precision = 22)
    public Integer getEmpleadoId() {
        return empleadoId;
    }




    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Column(name = "NOMBRE", unique = true, nullable = false, precision = 22)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "APELL_PATERNO", nullable = false)
    public String getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(String apellPaterno) {
        this.apellPaterno = apellPaterno;
    }


    @Column(name = "APELL_MATERNO", nullable = true)

    public String getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(String apellMaterno) {
        this.apellMaterno = apellMaterno;
    }

    @Column(name = "DIRECCION", unique = true, nullable = false, precision = 22)

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "TELEFONO", unique = true, nullable = false, precision = 22)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
