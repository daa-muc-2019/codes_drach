public class ViereckKlasse {

    public double breite;
    public double hoehe;
    public double flaeche;
    public double umfang;
    public String name;

    public ViereckKlasse(double b, double h) {
        this.breite=b;
        this.hoehe=h;
    }

    public void flaechenInhaltBerechnen(){ //public void setFlaeche()
        if(this.breite<0 || this.hoehe<0) {
            this.flaeche = 0;
        }
        this.flaeche = this.breite * this.hoehe;
    }

    public void umfangBerechnen(){
        if (this.breite<0 || this.hoehe <0){
            this.umfang = 0;
        }
        this.umfang = 2 * (this.breite+this.hoehe);
    }

    public void setBreite(double neueBreite){
        this.breite = neueBreite;
    }
    public void setHoehe(double neueHoehe){
        this.hoehe = neueHoehe;
    }

    public double getBreite() {
        return this.breite;
    }

    public double getHoehe() {
        return this.hoehe;
    }

    public double getFlaeche() {
        return this.flaeche;
    }

    public double getUmfang() {
        return this.umfang;
    }
    public String getName(){
        return this.name;
    }
}
