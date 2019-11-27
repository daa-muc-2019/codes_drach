public class DreieckMain {
    public static void main(String[] args){
        Dreieck erstesDreieck = new Dreieck(4,5,2,1);
        erstesDreieck.flaechenInhaltBerechnen();

        Dreieck rechtwinkligesDreieck = new Dreieck(4,2,9);
        rechtwinkligesDreieck.umfangBerechnen();
        System.out.println(rechtwinkligesDreieck.getFlaeche());

        Dreieck zweitesRechtwinkligesDreieck = new Dreieck(4,5);

    }
}
