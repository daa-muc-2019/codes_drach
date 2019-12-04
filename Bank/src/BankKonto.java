public class BankKonto {

    protected double kontostand;
    //Konstruktoren:
    public BankKonto(double anfangsBetrag){
        this.kontostand = anfangsBetrag;
    }
    public BankKonto(){
        this.kontostand = 0.0;
    }

    public double getKontostand(){
        return this.kontostand;
    }

    public void einzahlen(double x){
        this.kontostand += x;
    }

    public void abheben(double x){
        this.kontostand -= x;
    }
}



