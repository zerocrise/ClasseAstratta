
public class PersonaFisica extends Contribuente {
    private String codiceFiscale;

    public PersonaFisica(String codiceFiscale,double entrata,double uscita)
    { super(entrata,uscita);
        this.codiceFiscale = codiceFiscale;
    }
    public double fattoreDiSconto(){
    return 0.4;
    }
    public double aliquota(){
     return 0.27;
    }

public double daPagare(){
    double fds=fattoreDiSconto();
return aliquota()*super.imponibile(fds);
        
}
    
}
