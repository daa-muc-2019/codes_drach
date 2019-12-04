public class SparKonto extends BankKonto {

    private double zinsSatz;

    public SparKonto(double anfangsBetrag, double zinsSatz){
        super(anfangsBetrag);
        this.zinsSatz = zinsSatz;
    }
    public SparKonto(){
        super();
        this.zinsSatz = 0.02;
    }
    public void zinsenAnrechnen(){
        this.kontostand = this.kontostand + (this.kontostand * this.zinsSatz);
    }
}
