/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Lai.C
 */
public class AlikaGasy extends Alika{

    public AlikaGasy() {
    }
    public AlikaGasy(String nom,String couleur,int poids ) {
        this.nom=nom;
        this.couleur=couleur;
        this.poids=poids;
    }
    @Override
    public void crier() {
        System.out.println("Alika Gasy Mvovo wof wof.. :p ");
    }
    
}
