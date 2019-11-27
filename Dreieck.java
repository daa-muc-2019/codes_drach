
public class Dreieck {

    public double grundseite;
    public double hoehe;
    public double seiteA;
    public double seiteB; //Hier wird die Seite b gespeichert
    public double flaeche;
    public double umfang;

    public Dreieck(double g, double h, double a, double b){
        this.grundseite = g;
        this.hoehe = h;
        this.seiteA = a;
        this.seiteB = b;
    }
    public Dreieck(double hypothenuse, double kathete1, double kathete2){
        if(hypothenuse<kathete1){
            double tmp = kathete1;
            kathete1 = hypothenuse;
            hypothenuse = tmp;
        }
        if (hypothenuse< kathete2){
            double tmp = kathete2;
            kathete2 = hypothenuse;
            hypothenuse = tmp;
        }
        this.grundseite = hypothenuse;
        this.seiteA = kathete1;
        this.seiteB = kathete2;
        this.flaeche = kathete1*kathete2;
    }
    public Dreieck(double kathete1, double kathete2){
        this.seiteA=kathete1;
        this.seiteB=kathete2;
        this.grundseite = Math.sqrt((Math.pow(this.seiteA,2)+Math.pow(this.seiteB,2)));
        this.flaeche = this.seiteA*this.seiteB;
        this.umfang = this.seiteA + this.seiteB + this.grundseite;
    }

    public void flaechenInhaltBerechnen(){
        this.flaeche = (this.hoehe*this.grundseite)/2;
    }
    public void umfangBerechnen(){

        this.umfang = this.seiteA+this.seiteB+this.grundseite;
    }

    public void setGrundseite(double grundseite) {
        this.grundseite = grundseite;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public double getUmfang() {
        return this.umfang;
    }

    public double getHoehe() {
        return this.hoehe;
    }

    public double getFlaeche() {
        return this.flaeche;
    }

    public double getGrundseite() {
        return this.grundseite;
    }

    public double getSeiteA() {
        return this.seiteA;
    }

    public double getSeiteB() {
        return this.seiteB;
    }
}
