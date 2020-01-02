package com.ipiecoles.java.java220;


import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by pjvilloud on 21/09/17.
 */
public abstract class Employe {
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public Employe() {
    }

    //GETTERS

    public String getNom(){
        return this.nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }


    public Double getSalaire() {
        return salaire;
    }


    //SETTERS

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
        if(dateEmbauche.isAfter(LocalDate.now())) {
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }
        else{
            this.dateEmbauche = dateEmbauche;
        }
    }


    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }



    public final Integer getNombreAnneeAnciennete(){

        return LocalDate.now().getYear() - this.dateEmbauche.getYear();
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    public String toString(){
        return "Employe{" + "nom='"+ nom + '\''+", prenom='" + prenom  + '\''+
                ", matricule='" + matricule+ '\'' + ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom) &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(dateEmbauche, employe.dateEmbauche) &&
                Objects.equals(salaire, employe.salaire);
}

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public void augmenterSalaire(Double pourcentageAugmentation){
         this.salaire =  this.salaire * (1 + pourcentageAugmentation);
    }

}
