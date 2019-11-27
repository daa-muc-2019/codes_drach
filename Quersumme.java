import java.util.InputMismatchException;
import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args){
        //Methodenaufrufe:
        int zahl = zahlEinlesen(); // Zahl wird eingelesen
        int[] einzelneStellen = zerlegungDerZahl(zahl); // Zahl wird in einzelne Stellen zerlegt
        int ergebnis = summeDerZahlen(einzelneStellen); // einzelne Stellen werden addiert

        //Ausgabe im Format: zahl => stelle 1 + stelle 2 + ..... +stelle n = Quersumme
        System.out.print(zahl+ " => ");
        for(int i = 0; i<einzelneStellen.length-1;i++){
            System.out.print(einzelneStellen[i]+" + ");
        }
        System.out.print(einzelneStellen[einzelneStellen.length-1]+" = "+ergebnis);
    }
    public static int zahlEinlesen(){
        /* Benutzt Scanner, um Zahl vom Benutzer einzulesen.
        Falsch eine ungültige Zahl eingegeben wurde, wird der Fehler gefangen,
        und der Benutzer wird aufgefordert, eine andere Zahl einzugeben.
         */
        Scanner zahlenLeser = new Scanner(System.in); // Erstellen des Scanners
        System.out.println("Bitte geben Sie eine Zahl ein, von der die Quersumme berechnet werden soll:\n");
        try { //try = versuche folgende Anweisung durchzuführen
            int zahl = zahlenLeser.nextInt(); // in zahl wird die eingegebene Zahl gespeichert
            zahlenLeser.close(); // Wenn der Scanner nicht mehr benutzt wird, soll sich das Objekt beenden (nicht nötig, aber schöner so!)
            return zahl; // Wenn alles funktioniert hat, wird die eingegebene Zahl zurück an die main-Methode gegeben
        }
        catch(InputMismatchException e){ //Fehlerbehandlung in Java, wird noch besprochen [InputMismatchException = falsche Eingabe])
            System.out.println("Bitte geben Sie eine andere Zahl ein: "); // Benutzer wird aufgefordert, eine andere Zahl einzugeben
            return(zahlEinlesen()); //Erneuter Aufruf der Einlesefunktion
        }
    }
    public static int[] zerlegungDerZahl(int zahl){
        /* Methode zur Zerlegung einer Zahl,
        indem zuerst getestet wird, was die höchste 10er Potenz ist,
        durch die die Zahl teilbar ist.
        Abschließend wird durch diese Information die Zahl in einzelne Teile zerlegt,
        und als Array zurückgegeben.
         */
        int wieOftKannDurchZehnGeteiltWerden = 0; // Zähler, wie oft Zahl durch 10 teilbar ist
        int restNachDivision = zahl; // die ursprüngliche Zahl soll behalten werden, deswegen wird zur Berechnung die Zahl in einer anderen Variable gespeichert
        while(restNachDivision/10 != 0){ // Solange Zahl durch 10 teilbar ist
            restNachDivision /= 10; // teile Zahl durch 10
            wieOftKannDurchZehnGeteiltWerden++; // Zähle mit, wie oft durch 10 geteilt wurde
        }
        int[] stellenDerZahl = new int[wieOftKannDurchZehnGeteiltWerden+1]; // Array wird angelegt, Größe ist festgelegt, durch Anzahl der 10er Divisionen
        for(int j = 0;j<=wieOftKannDurchZehnGeteiltWerden;j++){ // um die einzelnen Stellen zu erhalten, wird die Zahl noch einmal durch die gefundenen 10er Potenzen zerlegt
            stellenDerZahl[j] =  zahl / (int) (Math.pow(10,wieOftKannDurchZehnGeteiltWerden-j)) % 10; //Durch % 10 erhalten wir immer die letzte Stelle der Zahl
        }
        return stellenDerZahl; // gibt das erstellte Array an die main-Methode zurück
    }
    public static int summeDerZahlen(int[] listeAnZahlen){
        /* Berechnet die Quersumme der Zahl,
        indem alle Zahlen im Array addiert werden.
         */
        int summe = 0; // Zwischenspeicher, in dem die Summer gespeichert wird
        for (int i = 0; i < listeAnZahlen.length; i++){
            summe += listeAnZahlen[i]; //Aufaddieren aller Zahlen im Array
        }
        return summe; // Die Gesamtsumme wird an die main-Methode zurückgegeben.
    }

}
