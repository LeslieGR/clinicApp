package com.superapp.demo.model;

//ESTA CLASE SERÁ DE UN DTO(DATA TRANSFER OBJECT), QUEDA EN PAUSA PORQUE DANI DIJO
public class Login {//este es un POJO, Plain Old Java Object, lleva atributos, getters, setters, toString
    String user;//esto es un atributo
    String password;//Esto es un atributo

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }//constructor

    public String getUser() {
        return user;
    }//getUser

    public void setUser(String user) {
        this.user = user;
    }//setUser

    public String getPassword() {
        return password;
    }//getUser

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    @Override
    public String toString() {
        return "Login{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }//toString
}

