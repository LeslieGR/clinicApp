package com.superapp.demo.model;

import jakarta.persistence.*;
//modelo, Es el encargado de los datos.
@Entity// Mapea la clase a una tabla o crea la tabla a base de la clase si no existe
@Table(name = "user")// le da el nombre que tu le estás pasando entre comillas,
// si no se pone esta anotación, le da el nombre de la clase a la tabla
public class User {
    @Id//Indica cuál es el Primary key de la tabla y si la tabla tiene primary key y no tiene esta anotación, te va a marcar error
    @GeneratedValue(strategy= GenerationType.IDENTITY)//para generar e incrementar automáticamente el id
    private int id;
    @Column(name= "email", length = 50, unique = true)
    private String email;
    @Column(name = "name", length = 50)//indica que la columna de la tabla se llamará name,
    // no se aceptarán valores nuloes y tendrá longitud de 70 caracteres
    private String name;
    @Column(name = "lastname", length = 50)
    private String lastname;
    @Column(name = "address", length = 250)
    private String address;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "age", length = 3)
    private String age;
    @Column(name ="gender", length = 20)
    private String gender;
    @OneToOne(cascade = CascadeType.ALL)//para hacer referencia a que será un relación bidireccional
    @JoinColumn(name = "medical_history_id", referencedColumnName = "id")//dice que crearemos una foreign key llamada "medicalHistoryId" en la tabla user, la cuál
    // será una referencia a la llave primaria de la tabla "medicalHistory" , llamada "id"
    private MedicalHistory medicalHistory;

    public User(int id, String email, String name, String lastname, String address, String phone, String age, String gender, MedicalHistory medicalHistory) {
        this.id= id;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
    }//constructor

    public User() {
    }

    public int getId() {
        return id;
    }//getId

    public void setId(int id) {
        this.id = id;
    }//setId

    public String getEmail() {
        return email;
    }//getEmail

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "User{" +
                "email=" + email + '\'' +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", medicalHistory=" + medicalHistory +
                '}';
    }//toString
}
