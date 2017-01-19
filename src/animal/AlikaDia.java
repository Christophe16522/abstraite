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
public class AlikaDia extends Alika{

    public AlikaDia() {
    }
    public AlikaDia(String nom,String couleur,int poids ) {
        this.nom=nom;
        this.couleur=couleur;
        this.poids=poids;
    }
    
    @Override
    public void crier() {
        System.out.println("Alika Dia Mvovo WOF WOF.. :p ");
    }
    
}
