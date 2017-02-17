/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_of_life;

/**
 *
 * @author Asus
 */
public abstract class Poisson {
    String sexe;

    public Poisson(String sexe) {
        this.sexe = sexe;
    }

    public String getSexe() {
        return sexe;
    }
    public void seReproduire(){
    
    }
    
    public void seDéplacer(){
    
    }
    
    public void vieillir(){
    
    }
    
    public void mourrir(){
    
    }
}
