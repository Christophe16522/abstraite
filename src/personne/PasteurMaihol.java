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
public class PasteurMaihol extends Pretre {

    public PasteurMaihol() {
    }

    public PasteurMaihol(String nom, String sexe, int age) {
//        this.nom = nom;
//        this.sexe = sexe;
//        this.age = age;
        //rehefa mapiasa an io super io aho dia mihanto an le constructeur an le classe mere zn we ny an le classe pretre
        //mitovy ian io sy le this. eo ambony io
        super(nom, sexe, age);
    }

    @Override
    public void danse() {
        {
            System.out.println("Danse : Rhithme apkalipsy " + nom);

        }
    }
}
