package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe {
    private Double caAnnuel = 0d;
    private Integer performance;

    public Commercial( String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel){
        super(nom, prenom,  matricule,  dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire,Double caAnnuel, Integer performance){
        this(nom, prenom,  matricule,  dateEmbauche, salaire, caAnnuel);
        this.performance = performance;
    }

    public Double getCaAnnuel() {
        return this.caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commercial)) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;
        return Objects.equals(caAnnuel, that.caAnnuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caAnnuel);
    }

    public Double getPrimeAnnuelle(){
        return Math.max(Math.ceil(this.caAnnuel * 0.05),500);
    }

    public boolean performanceEgale(int perf){
        if(perf == this.performance){
            return true;
        }
        else{
            return false;
        }
    }

}
