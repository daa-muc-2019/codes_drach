public class ViereckeMain {
    public static void main(String[] args){
        ViereckKlasse neuesViereck = new ViereckKlasse(5,4);
        neuesViereck.flaechenInhaltBerechnen();
        System.out.println(neuesViereck.flaeche);

        ViereckKlasse zweitesViereck = new ViereckKlasse(2,2);
        zweitesViereck.flaechenInhaltBerechnen();

        System.out.println(neuesViereck.flaeche+zweitesViereck.flaeche);

        zweitesViereck.setBreite(5.5);
        zweitesViereck.flaechenInhaltBerechnen();
        System.out.println(zweitesViereck.getBreite());
        System.out.println(zweitesViereck.getFlaeche());
        zweitesViereck.umfangBerechnen();

        ViereckKlasse drittesViereck = new ViereckKlasse(zweitesViereck.getBreite(),neuesViereck.getHoehe());


    }
}
