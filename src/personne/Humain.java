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
//Humain classe Filles de l'Etre vivant donc peut heriter tout les fonction de ce derniers
public abstract class Humain extends EtreVivant{

    @Override
    public void danse() {
        System.out.println("Danses des Humains");
    }
    
}
