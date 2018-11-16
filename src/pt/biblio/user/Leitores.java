/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.biblio.user;

import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class Leitores {
    
    ArrayList<Leitor> leitores = new ArrayList();

   public void gerirleitores() {
        leitores.add(new Leitor("Bernardo O. Dias", "BB00001"));
        leitores.add(new Leitor("Francisco Lamy", "BB00002"));
        leitores.add(new Leitor("Bruno Guedes", "BB00003"));
}

 

}