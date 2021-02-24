
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rolandosucco
 */
public class Main {
    public static void main(String[] args) {
     ArrayList<Contribuente> c=new ArrayList();
     c.add(new PersonaFisica("cdaq",400,10));
     c.add(new PersonaGiuridica("swgfs",1000,100));
     c.add(new PersonaFisica("cdaqr",2400,120));
     c.add(new PersonaGiuridica("swg2fs",2000,300));
     Fisco f=new Fisco();
     System.out.println(f.calcola(c));
        System.out.println(f.filtra(c));
     
    }
    
}
