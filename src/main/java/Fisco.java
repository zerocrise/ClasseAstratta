
import java.util.ArrayList;


public class Fisco {
    public double calcola(ArrayList<Contribuente> c){
    double somma=0;
    for(Contribuente a:c)
        somma+=a.daPagare();
    return somma;    }
 public int filtra(ArrayList<Contribuente> c){
 int conta=0;
 for(Contribuente a:c){
  if(a instanceof PersonaFisica)
  conta++;
 }
 return conta;
 }   
}
