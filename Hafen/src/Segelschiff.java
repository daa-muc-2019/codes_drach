public class Segelschiff extends Schiff {

    private int segelflaeche;

    public Segelschiff(int tonnage, int segelflaeche){
        super(tonnage);
        this.segelflaeche = segelflaeche;
    }

    @Override
    public String antriebAusgeben(){
        return("Dieses Schiff segelt mit einer Flaeche von: "+this.segelflaeche);
    }
}
