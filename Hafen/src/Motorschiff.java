public class Motorschiff extends Schiff {

    private int motorleistung;

    public Motorschiff(int tonnage, int motorleistung){
        super(tonnage);
        this.motorleistung = motorleistung;
    }

    @Override
    public String antriebAusgeben(){
        return("Das Schiff faehrt mit Motor: "+this.motorleistung);
    }
}
