package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.Date;

public class Employe {
    private static int lastNumEmploye;

    private int numEmploye;
    private int numSecu;

    private String nom;
    private String prenom;

    private int echelon;

    private LocalDate birthdate;
    private LocalDate recrutementDate;

    private double base;
    private double nbHeures;
    private double salaireBrut;
    private double salaireNet;

    public void setNumSecu(int numSecu) {
        this.numSecu = numSecu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBase(double base) {
        this.base = base;
        this.salaireBrut = this.base * this.nbHeures;
        this.salaireNet = this.salaireBrut * 0.8;
    }

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
        this.salaireBrut = this.base * this.nbHeures;
        this.salaireNet = this.salaireBrut * 0.8;
    }

    public int getNumEmploye() {
        return numEmploye;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getEchelon() {
        return echelon;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getRecrutementDate() {
        return recrutementDate;
    }

    public double getBase() {
        return base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public Employe (int numSecu, String nom, String prenom, int echelon, Date birthdate, Date recrutementDate, double base, double nbHeures) {
        this.numEmploye = (lastNumEmploye++)+1;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.birthdate = LocalDate.of(birthdate.getYear(),birthdate.getMonth(),birthdate.getDay());
        this.recrutementDate = LocalDate.of(recrutementDate.getYear(),recrutementDate.getMonth(),recrutementDate.getDay());
        this.base = base;
        this.nbHeures = nbHeures;
        this.salaireBrut = this.base * this.nbHeures;
        this.salaireNet = this.salaireBrut * 0.8;
    }

    public void showEmploye() {
        System.out.println( "\n"+"numEmploye : "+ numEmploye + "\n"+
                "numSecu : "+ numSecu + "\n"+
                "nom : "+ nom + "\n"+
                "prenom : "+ prenom + "\n"+
                "birthdate : "+ birthdate + "\n"+
                "recrutement date : "+ recrutementDate + "\n"+"\n"
        );
    }
}