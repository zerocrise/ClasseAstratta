
public class PersonaGiuridica extends Contribuente {
    private String pIva;

    public PersonaGiuridica(String pIva,double entrata,double uscita)
    { super(entrata,uscita);
        this.pIva = pIva;
    }
    public double fattoreDiSconto(){
    return 0.3;
    }
    public double aliquota(){
     return 0.30;
    }

public double daPagare(){
return aliquota()*super.imponibile(fattoreDiSconto());
        
}
    
}
