package com.superapp.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "diabetes")
    private Boolean diabetes;
    @Column(name = "high_blood_pressure")
    private Boolean highBloodPressure;
    @Column(name = "low_blood_pressure")
    private Boolean lowBloodPressure;
    @Column(name = "hepatitis")
    private Boolean hepatitis;
    @Column(name = "hemophilia")
    private Boolean hemophilia;
    @Column(name = "cardiac_disease")
    private Boolean cardiacDisease;
    @Column(name = "pacemaker")
    private Boolean pacemaker;
    @Column(name = "HIV")
    private Boolean HIV;
    @Column(name = "AIDS")
    private Boolean AIDS;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_procedure_id", referencedColumnName = "id")
    private List<MedicalProcedure> medicalProcedureIdList;

    public MedicalHistory() {
    }

    public MedicalHistory(int id, Boolean diabetes, Boolean highBloodPressure, Boolean lowBloodPressure, Boolean hepatitis, Boolean hemophilia, Boolean cardiacDisease, Boolean pacemaker, Boolean HIV, Boolean AIDS, User userId, List<MedicalProcedure> medicalProcedureIdList) {
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
        this.userId = userId;
        this.medicalProcedureIdList = medicalProcedureIdList;
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public List<MedicalProcedure> getMedicalProcedureIdList() {
        return medicalProcedureIdList;
    }

    public void setMedicalProcedureIdList(List<MedicalProcedure> medicalProcedureIdList) {
        this.medicalProcedureIdList = medicalProcedureIdList;
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
                ", userId=" + userId +
                ", medicalProcedureIdList=" + medicalProcedureIdList +
                '}';
    }
}
