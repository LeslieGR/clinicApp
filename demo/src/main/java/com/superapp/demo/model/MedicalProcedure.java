package com.superapp.demo.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity// Mapea la clase a una tabla o crea la tabla a base de la clase si no existe
@Table(name = "medical_procedure")
public class MedicalProcedure {
    @Id//Indica cuál es el Primary key de la tabla y si la tabla tiene primary key y no tiene esta anotación, te va a marcar error
    @GeneratedValue(strategy= GenerationType.IDENTITY)//para generar e incrementar automáticamente el id
    private int id;
    @Column(name= "procedure_name", length = 50)
    private String procedureName;
    @Column(name= "treatment", length = 300)
    private String treatment;
    @Column(name= "total_cost", length = 10)
    private double totalCost;
    @Column(name= "remaining", length = 10)
    private double remaining;
    @Column(name= "paid")
    private Boolean paid;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_history_id", referencedColumnName = "id")
    private MedicalHistory medicalHistoryId;

//    @OneToMany
//    @JoinColumn(name = "payment_id")
//    private Payment paymentId;
//    @OneToMany
//    @JoinColumn(name = "appointment_id")
//    private Appointment appointmentId;


    public MedicalProcedure(int id, String procedureName, String treatment, double totalCost, double remaining, Boolean paid, MedicalHistory medicalHistoryId) {
        this.id = id;
        this.procedureName = procedureName;
        this.treatment = treatment;
        this.totalCost = totalCost;
        this.remaining = remaining;
        this.paid = paid;
        this.medicalHistoryId = medicalHistoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public MedicalHistory getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(MedicalHistory medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId;
    }

    @Override
    public String toString() {
        return "MedicalProcedure{" +
                "id=" + id +
                ", procedureName='" + procedureName + '\'' +
                ", treatment='" + treatment + '\'' +
                ", totalCost=" + totalCost +
                ", remaining=" + remaining +
                ", paid=" + paid +
                ", medicalHistoryId=" + medicalHistoryId +
                '}';
    }
}
