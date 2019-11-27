public class Kreis {
    public double radius;
    public Mittelpunkt mittelPunkt;
    public double xKoordinate;
    public double yKoordinate;
    public double umfang;
    public double flaechenInhalt;

    public Kreis(double rad, double x, double y) {
        // rad = -5 => math.abs(-5) = 5
        // rad = 5 => math.abs(5) = 5

        this.radius = Math.abs(rad);
        if(rad<0){
            this.radius = 0;
        }
        this.xKoordinate = x;
        this.yKoordinate = y;
        this.mittelPunkt = new Mittelpunkt(this.xKoordinate,this.yKoordinate);
    }

    public void setUmfang(){
        //(U = 2 * r * π )
        this.umfang = 2*this.radius*Math.PI;
    }

    public void setFlaechenInhalt(){
        //(A = r² * π )
        this.flaechenInhalt = Math.pow(this.radius,2)*Math.PI;
        // this.flaechenInhalt = this.radius * this.radius * Math.PI;
    }

    public double getyKoordinate() {
        return this.yKoordinate;
    }

    public double getxKoordinate() {
        return this.xKoordinate;
    }

    public double getUmfang() {
        return this.umfang;
    }

    public double getFlaechenInhalt() {
        return this.flaechenInhalt;
    }

    public double getRadius() {
        return this.radius;
    }

    public Mittelpunkt getMittelPunkt() {
        return this.mittelPunkt;
    }

    public void setyKoordinate(double yKoordinate) {
        this.yKoordinate = yKoordinate;
    }

    public void setxKoordinate(double xKoordinate) {
        this.xKoordinate = xKoordinate;
    }

    public void setMittelPunkt() {
        this.mittelPunkt = new Mittelpunkt(this.xKoordinate,this.yKoordinate);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
