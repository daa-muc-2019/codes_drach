import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args){
        Scanner eingabeScanner = new Scanner(System.in);
        /*System.out.println("Bitte geben Sie eine Zahl ein: ");
        int posOderNeg = eingabeScanner.nextInt();
        positivOderNegativ(posOderNeg);
        System.out.println("Bitte geben Sie drei Zahlen ein: ");
        int zahl1 = eingabeScanner.nextInt();
        int zahl2 = eingabeScanner.nextInt();
        int zahl3 = eingabeScanner.nextInt();
        if(welcheZahlIstDieGroesste(zahl1,zahl2,zahl3) != -1) {
            System.out.println(welcheZahlIstDieGroesste(zahl1, zahl2, zahl3) + " ist die hoechste!");
        }
        else{
            System.out.println("Error!");
        }*/
        System.out.println("Bitte geben Sie ein, der wie vielte Tag heute ist: ");
        int wochentag = eingabeScanner.nextInt();
        welcherTagIstHeute(wochentag);
        System.out.println("Bitte geben Sie 3 Zahlen ein, um die Lösung der quadratischen Gleichung zu erhalten: ");
        double a = eingabeScanner.nextDouble();
        double b = eingabeScanner.nextDouble();
        double c = eingabeScanner.nextDouble();
        mitternachtsFormel(a,b,c);
        System.out.println("Bitte geben Sie ein Jahr zur Überprüfung ein: ");
        int jahr = eingabeScanner.nextInt();
        if(schaltjahr(jahr)){
            System.out.println("Das Jahr ist ein Schaltjahr!");
        }
        else{
            System.out.println("Das Jahr ist kein Schaltjahr!");
        }


    }

    public static void positivOderNegativ(int zahl){
        if (zahl >= 0){
            System.out.println("Die Zahl ist positiv!");
        }
        else{
            System.out.println("Die Zahl ist negativ!");
        }
    }
    public static int welcheZahlIstDieGroesste(int zahl1, int zahl2, int zahl3){
        if(zahl1 > zahl2 && zahl1 > zahl3){
            return(zahl1);
        }
        else if(zahl2 > zahl1 && zahl2 > zahl3){
            return(zahl2);
        }
        else if(zahl3 > zahl1 && zahl3 > zahl2){
            return(zahl3);
        }
        else{
            return -1;
        }
    }
    public static void welcherTagIstHeute(int zahl) {
        switch (zahl) {
            case 1:
                System.out.println("Heute ist Montag");
                break;
            case 2:
                System.out.println("Heute ist Dienstag");
                break;
            case 3:
                System.out.println("Heute ist Mittwoch");
                break;
            case 4:
                System.out.println("Heute ist Donnerstag");
                break;
            case 5:
                System.out.println("Heute ist Freitag");
                break;
            case 6:
                System.out.println("Heute ist Samstag");
                break;
            case 7:
                System.out.println("Heute ist Sonntag");
                break;
            default:
                while (zahl/7 > 1) {
                    int rest = zahl%7;
                    zahl = (zahl/7)+rest;
                }
                zahl = zahl%7;
                welcherTagIstHeute(zahl);

        }
    }
    public static void mitternachtsFormel(double a, double b, double c){
        if(((Math.pow(b,2))-(4*a*c)) >= 0){
            double x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a));
            double x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a));
            System.out.println("X1: "+x1+"\nX2: "+x2);
        }
        else{
            System.out.println("Die Gleichung hat keine Lösung!");
        }
    }
    public static boolean schaltjahr(int jahr){
        if(jahr % 4 == 0 && jahr%100 != 0){
            return true;
        }
        else{
            return false;
        }
    }
}

