package com.superapp.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity// Mapea la clase a una tabla o crea la tabla a base de la clase si no existe
@Table(name = "appointment")
public class Appointment {

    @Id//Indica cuál es el Primary key de la tabla y si la tabla tiene primary key y no tiene esta anotación, te va a marcar error
    @GeneratedValue(strategy= GenerationType.IDENTITY)//para generar e incrementar automáticamente el id
    private int id;
    @Column(name= "date", length = 20)
    private Date date;
    @Column(name= "notes", length = 500)
    private String notes;
    @ManyToOne
    @JoinColumn(name = "medical_procedure_id")
    private MedicalProcedure medicalProcedure;

    public Appointment(int id, Date date, String notes, MedicalProcedure medicalProcedure) {
        this.id = id;
        this.date = date;
        this.notes = notes;
        this.medicalProcedure = medicalProcedure;
    }

    public Appointment(String notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public MedicalProcedure getMedicalProcedure() {
        return medicalProcedure;
    }

    public void setMedicalProcedure(MedicalProcedure medicalProcedure) {
        this.medicalProcedure = medicalProcedure;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", notes='" + notes + '\'' +
                ", medicalProcedure=" + medicalProcedure +
                '}';
    }
}
