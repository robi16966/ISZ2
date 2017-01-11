/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fei.isz.group1.zadanie2_isz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Róbert
 */
public class ZvieratDB {
    private final Map<String, Zvierata> ZvieratDB = new HashMap<>();
    
   
    public synchronized boolean removeZvierat(String typ) {
        Zvierata removedZvierat = ZvieratDB.remove(typ);
        return removedZvierat != null;
    }
    

    public synchronized void addZvierat(Zvierata newZvierat) {
        ZvieratDB.put(newZvierat.getTyp().toLowerCase(), newZvierat);
    }
    

    public synchronized Zvierata getZvierat(String typ) {
        return ZvieratDB.get(typ.toLowerCase());
    }
    

    public synchronized List<Zvierata> getAllZvierat() {
        return new ArrayList(ZvieratDB.values());
    }
    
}
