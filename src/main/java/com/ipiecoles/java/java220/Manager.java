package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Objects;

public class Manager extends Employe {
    public Manager(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, HashSet<Technicien> equipe) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.equipe = equipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien){
        equipe.add(technicien);
    }

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }

    private HashSet<Technicien> equipe = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(equipe, manager.equipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), equipe);
    }
}
