/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fei.isz.group1.zadanie2_isz;
//https://en.wikipedia.org/wiki/List_of_animal_sounds

import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

/**
 *
 * @author Róbert
 */
public class Zadanie2_isz {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        SpringApplication.run(Zadanie2_isz.class, args);
    }
    @Bean
    public CommandLineRunner dem(){//EntitzManager em
        
        return new CommandLineRunner() {
            
            @Override
            public void run(String... strings) throws Exception{
                kon kon=new kon();
                kozicka koz=new kozicka();
                macka mac=new macka();
                ovecka ovec= new ovecka();
                pes pes=new pes();

                lev lev=new lev();
                puma puma=new puma();
                zirafa zirafa=new zirafa();

                kon.vydavaZvuk();
                koz.vydavaZvuk();
                mac.vydavaZvuk();
                ovec.vydavaZvuk();
                pes.vydavaZvuk(); 
                lev.vydavajZvuk();
                puma.vydavajZvuk();
                zirafa.vydavajZvuk();
                //Uloha2
                JSONParser parser = new JSONParser();
                ZvieratDB zvieratDB=new ZvieratDB();

                try {
                    Object obj = parser.parse(new FileReader(
                            "zvierata.json"));

                    JSONObject jsonObject = (JSONObject) obj;
                    JSONArray zvierata = (JSONArray) jsonObject.get("Zvierata");

                    for(int i=0; i<zvierata.size();i++){
                        JSONObject tmp=(JSONObject) zvierata.get(i);
                        zvieratDB.addZvierat(new Zvierata((String) tmp.get("typ"),(String) tmp.get("druh"),(String) tmp.get("zvuk")));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Scanner scanner = new Scanner(System.in);
                String command = null;
                do{
                    System.out.print("Zadajte zviera alebo \"QUIT\": ");
                    command=scanner.nextLine();
                    Zvierata tmp= zvieratDB.getZvierat(command);
                    if(tmp!=null){
                        tmp.vydZvuk();
                    }
                    else
                        System.out.println("Neexistuje v datababaze: "+command);
                        
                } while(!command.equals("QUIT"));
            }      
        };
    }
}