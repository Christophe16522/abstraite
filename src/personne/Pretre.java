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
public class Pretre extends Humain {

    public Pretre() {
    }

    public Pretre(String nom, String sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    @Override
    public void danse() {
        {
            System.out.println("Danse : Mon pere si ma soeur mihady tolan-kena ...."+nom);
        }
    }
}
