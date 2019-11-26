package com.ipiecoles.java.java220;


import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
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
            System.out.print("La date d'embauche ne peut être postérieure à la date courante");
        }
        else{
            this.dateEmbauche = dateEmbauche;
        }
    }


    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }



    public Integer getNombreAnneeAnciennete(){

        return LocalDate.now().getYear() - this.dateEmbauche.getYear();
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    public String toString(){
        return "Employe{" + "nom="+ nom + ", prenom=" + prenom +
                ", matricule=" + matricule + ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire + "}";
    }

}
