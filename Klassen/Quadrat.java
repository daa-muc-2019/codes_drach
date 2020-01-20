public class Quadrat implements GleichseitigesVieleck {
    public int seitenlaenge;
    public int seitenZahl;

    public Quadrat(int seitenlaenge){
        this.seitenlaenge = seitenlaenge;
        this.seitenZahl = 4;
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
