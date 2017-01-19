/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstraite;

import personne.PasteurJocelin;
import personne.PasteurMaihol;

/**
 *
 * @author Lai.C
 */
public class ClasseAbstraite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AlikaDia ag = new AlikaDia("bily", "mainty be", 45);
//        ag.deplacement();
//          Pretre p = new Pretre("pere pedro", "Homme", 90);
//          p.danse();
        PasteurMaihol pm = new PasteurMaihol("maihol", "homme", 50);
        pm.danse();
        PasteurJocelin pj = new PasteurJocelin("maihol", "", 50);
        pj.danse();
    }

}
