/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

/**
 *
 * @author Lai.C
 */
public class Femme extends Humain {

    public Femme() {
    }

    public Femme(String nom, String sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    @Override
    public void danse() {
        {
            System.out.println("Danses des Femme Atovy a dihan Mijah ...");
        }
    }
}
