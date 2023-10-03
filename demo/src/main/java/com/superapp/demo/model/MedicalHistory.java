package com.superapp.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "diabetes")
    Boolean diabetes;
    @Column(name = "high_blood_pressure")
    Boolean highBloodPressure;
    @Column(name = "low_blood_pressure")
    Boolean lowBloodPressure;
    @Column(name = "hepatitis")
    Boolean hepatitis;
    @Column(name = "hemophilia")
    Boolean hemophilia;
    @Column(name = "cardiac_disease")
    Boolean cardiacDisease;
    @Column(name = "pacemaker")
    Boolean pacemaker;
    @Column(name = "HIV")
    Boolean HIV;
    @Column(name = "AIDS")
    Boolean AIDS;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
    @ManyToOne
    @JoinColumn(name = "medical_procedure_id")
    MedicalProcedure medicalProcedureList;

    public MedicalHistory() {
    }


    public MedicalHistory(int id, Boolean diabetes, Boolean highBloodPressure, Boolean lowBloodPressure, Boolean hepatitis, Boolean hemophilia, Boolean cardiacDisease, Boolean pacemaker, Boolean HIV, Boolean AIDS, User user, MedicalProcedure medicalProcedureList) {
        this.id = id;
        this.diabetes = diabetes;
        this.highBloodPressure = highBloodPressure;
        this.lowBloodPressure = lowBloodPressure;
        this.hepatitis = hepatitis;
        this.hemophilia = hemophilia;
        this.cardiacDisease = cardiacDisease;
        this.pacemaker = pacemaker;
        this.HIV = HIV;
        this.AIDS = AIDS;
        this.user = user;
        this.medicalProcedureList = medicalProcedureList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(Boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    public Boolean getLowBloodPressure() {
        return lowBloodPressure;
    }

    public void setLowBloodPressure(Boolean lowBloodPressure) {
        this.lowBloodPressure = lowBloodPressure;
    }

    public Boolean getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(Boolean hepatitis) {
        this.hepatitis = hepatitis;
    }

    public Boolean getHemophilia() {
        return hemophilia;
    }

    public void setHemophilia(Boolean hemophilia) {
        this.hemophilia = hemophilia;
    }

    public Boolean getCardiacDisease() {
        return cardiacDisease;
    }

    public void setCardiacDisease(Boolean cardiacDisease) {
        this.cardiacDisease = cardiacDisease;
    }

    public Boolean getPacemaker() {
        return pacemaker;
    }

    public void setPacemaker(Boolean pacemaker) {
        this.pacemaker = pacemaker;
    }

    public Boolean getHIV() {
        return HIV;
    }

    public void setHIV(Boolean HIV) {
        this.HIV = HIV;
    }

    public Boolean getAIDS() {
        return AIDS;
    }

    public void setAIDS(Boolean AIDS) {
        this.AIDS = AIDS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MedicalProcedure getMedicalProcedureList() {
        return medicalProcedureList;
    }

    public void setMedicalProcedureList(MedicalProcedure medicalProcedureList) {
        this.medicalProcedureList = medicalProcedureList;
    }

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "id=" + id +
                ", diabetes=" + diabetes +
                ", highBloodPressure=" + highBloodPressure +
                ", lowBloodPressure=" + lowBloodPressure +
                ", hepatitis=" + hepatitis +
                ", hemophilia=" + hemophilia +
                ", cardiacDisease=" + cardiacDisease +
                ", pacemaker=" + pacemaker +
                ", HIV=" + HIV +
                ", AIDS=" + AIDS +
                ", user=" + user +
                ", medicalProcedureList=" + medicalProcedureList +
                '}';
    }
}
