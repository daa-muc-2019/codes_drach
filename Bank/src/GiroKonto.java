public class GiroKonto extends BankKonto {

    private double gebuehr;

    public GiroKonto(double anfangsBetrag, double gebuehr){
        super(anfangsBetrag);
        this.gebuehr = gebuehr;
    }
    public GiroKonto(){
        super();
        this.gebuehr = 0.5;
    }
    @Override
    public void einzahlen(double x){
        this.kontostand = this.kontostand+x-this.gebuehr;
    }
    @Override
    public void abheben(double x){
        this.kontostand = this.kontostand-x-this.gebuehr;
    }

}
