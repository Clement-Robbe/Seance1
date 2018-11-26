package fr.univ_amu.iut.exo1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entreprise {
    private String nom;
    private List<Employe> employes;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Entreprise (String nom) {
        employes = new ArrayList<>();
        this.nom = nom;
    }

    public void embaucher(Employe nouvelEmploye) {
        employes.add(nouvelEmploye);
    }

    public void licencier(int numEmploye) {
        for (int i = 0; i < employes.size(); ++i) {
            if (employes.get(i).getNumEmploye() == numEmploye) {
                employes.remove(i);
                break;
            }
        }
    }
}
