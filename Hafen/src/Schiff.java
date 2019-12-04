public class Schiff {

    protected int tonnage;
    protected int beladung;

    public Schiff(int tonnage){
        this.tonnage = tonnage;
    }
    public void beladen(int ladung){
        if(this.beladung+ladung <= this.tonnage){
            this.beladung += ladung;}
        else{
            System.out.println("Das Schiff kann nicht weiter beladen werden!");
        }
    }
    public String antriebAusgeben(){
        return("kein Antrieb");
    }
}
