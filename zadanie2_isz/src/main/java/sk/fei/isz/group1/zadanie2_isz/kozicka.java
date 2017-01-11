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
public class kozicka implements DomaceZviera {

    private String zvuk;
    private String typ;
    public kozicka(){
        zvuk="Meee";
        typ="Kozicka";
    }
    @Override
    public void vydavaZvuk() {
            System.out.println(typ+": "+zvuk);
    } 
    
}
