public abstract class Contribuente {
    private double entrata;
    private double uscita;

    public Contribuente(double entrata, double uscita) {
        this.entrata = entrata;
        this.uscita = uscita;
    }
 public double imponibile(double fds){
  return (entrata - uscita)*fds;
 }   
 public abstract double daPagare();   
}
