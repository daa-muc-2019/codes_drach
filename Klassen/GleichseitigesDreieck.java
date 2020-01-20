public class GleichseitigesDreieck implements GleichseitigesVieleck{
    public int seitenlaenge;
    public int seitenZahl;

    public GleichseitigesDreieck(int seitenlaenge){
        this.seitenlaenge = seitenlaenge;
        this.seitenZahl = 3;
    }

    @Override
    public int getAnzahlSeiten() {
        return this.seitenZahl;
    }

    @Override
    public int getSeitenLaenge() {
        return this.seitenlaenge;
    }

    @Override
    public int getUmfang() {
        return (this.seitenZahl*this.seitenlaenge);
    }

    @Override
    public double getInnenWinkel() {
        return Math.toDegrees((this.seitenZahl-2)*(Math.PI/this.seitenZahl));
    }
}
