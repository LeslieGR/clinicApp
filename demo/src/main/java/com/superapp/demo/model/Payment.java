package com.superapp.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity// Mapea la clase a una tabla o crea la tabla a base de la clase si no existe
@Table(name = "payment")
public class Payment {
    @Id//Indica cuál es el Primary key de la tabla y si la tabla tiene primary key y no tiene esta anotación, te va a marcar error
    @GeneratedValue(strategy= GenerationType.IDENTITY)//para generar e incrementar automáticamente el id
    private int folio;
    @Column(name= "amount", length = 10)
    private double amount;
    @Column(name= "date", length = 20)
    private Date date;
    @Column(name= "payment_method", length = 20)
    private String paymentMethod;
    @ManyToOne
    @JoinColumn(name = "medical_procedure_id")
    private MedicalProcedure medicalProcedure;

    public Payment(int folio, double amount, Date date, String paymentMethod, MedicalProcedure medicalProcedure) {
        this.folio = folio;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.medicalProcedure = medicalProcedure;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public MedicalProcedure getMedicalProcedure() {
        return medicalProcedure;
    }

    public void setMedicalProcedure(MedicalProcedure medicalProcedure) {
        this.medicalProcedure = medicalProcedure;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "folio=" + folio +
                ", amount=" + amount +
                ", date=" + date +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", medicalProcedure=" + medicalProcedure +
                '}';
    }
}
