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
//Classe mere de tout les etres vivants
abstract class EtreVivant {
    protected String nom;
    protected String sexe;
    protected int age;
    
    public abstract void danse();
}
