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
public class Zvierata implements DomaceZviera,DivokeZviera {
    private String typ;
    private String druh;
    private String zvuk;

    public Zvierata(String typ, String druh, String zvuk) {
        this.typ = typ;
        this.druh = druh;
        this.zvuk = zvuk;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getZvuk() {
        return zvuk;
    }

    public void setZvuk(String zvuk) {
        this.zvuk = zvuk;
    }
    
    public void vydZvuk(){
        if(druh.equals("Domace"))
            vydavaZvuk();
        else
            vydavajZvuk();
    }

    @Override
    public void vydavaZvuk() {
            System.out.println(typ+"["+druh+"]"+": "+zvuk);
    } 

    @Override
    public void vydavajZvuk() {
            System.out.println(typ+"["+druh+"]"+": "+zvuk.toUpperCase());
    } 
    
    
}
