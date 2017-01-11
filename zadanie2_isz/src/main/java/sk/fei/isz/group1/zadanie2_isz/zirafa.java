/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fei.isz.group1.zadanie2_isz;

/**
 *
 * @author Róbert
 */
public class zirafa implements DivokeZviera {

    private String zvuk;
    private String typ;
    public zirafa(){
        zvuk="bleat";
        typ="Zirafa";
    }
    @Override
    public void vydavajZvuk() {
            System.out.println(typ+": "+zvuk.toUpperCase());
    } 
    
}
