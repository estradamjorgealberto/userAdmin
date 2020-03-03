package com.user.demo.com.user.demo.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuarios implements  java.io.Serializable {

    private Integer userId;
    private String  email;
    private String  password;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USUER_ID", unique = true, nullable = false, precision = 22)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Column(name = "EMAIL", unique = true, nullable = false, precision = 22)

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PASSWORD", unique = true, nullable = false, precision = 22)

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
