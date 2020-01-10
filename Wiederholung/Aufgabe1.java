import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args){
        Scanner eingabeScanner = new Scanner(System.in);
        /*System.out.println("Bitte geben Sie eine Temperatur ein: ");
        double temperatur = eingabeScanner.nextDouble();
        System.out.println(temperatur+ "° sind:");
        System.out.println(celsiusZuFahrenheit(temperatur)+"° Fahrenheit");
        System.out.println(fahrenheitZuCelsius(temperatur)+"° Celsius");

        System.out.println("Bitte geben Sie Minuten ein: (Grosse Zahl)");
        long minuten = eingabeScanner.nextLong();
        int[] ergebnisJahresRechner = jahresrechner(minuten);
        System.out.println(ergebnisJahresRechner[0]+" Jahre, "+ergebnisJahresRechner[1]+" Monate, "+ ergebnisJahresRechner[2]+" Tage, "+ergebnisJahresRechner[3]+ " Stunden, "+ergebnisJahresRechner[4] + " Minuten.");

        double groesse, gewicht = 0.0;
        System.out.println("Bitte geben Sie Ihre Groesse und Gewicht an:\nGroesse (in Meter):");
        try{groesse = eingabeScanner.nextDouble();}
        catch (InputMismatchException e){
            String groesseString = eingabeScanner.next();
            groesse = Double.parseDouble(groesseString);
        }
        System.out.println("Gewicht (in Kilogramm): ");
        try{gewicht = eingabeScanner.nextDouble();}
        catch (InputMismatchException ime){
            String gewichtString = eingabeScanner.next();
            gewicht = Double.parseDouble(gewichtString);
        }
        double bmi = bmiRechner(groesse,gewicht);
        bmiEinschaetzung(bmi);
         */
        System.out.println("Bitte geben Sie die Strecke ein (in Kilometer): ");
        double strecke = eingabeScanner.nextDouble();
        System.out.println("Bitte geben Sie die Zeit ein (in Minuten): ");
        double zeit = eingabeScanner.nextDouble();
        geschwindigkeitsrechner(strecke,zeit);
    }

    public static void geschwindigkeitsrechner(double strecke, double zeit){
        double zeitInSekunden = zeit * 60;
        double zeitInStunden = zeit/60;
        double streckeInKM = strecke;
        strecke = strecke * 1000;
        System.out.println("Geschwindigkeit:\n"+(Math.round((strecke/zeitInSekunden)*10)/10)+" m/s\n"+(Math.round((streckeInKM/zeitInStunden)*10)/10)+" km/h");
    }

    public static double fahrenheitZuCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.7;
        return celsius;
    }

    public static double celsiusZuFahrenheit(double celsius){
        double fahrenheit = (celsius + 32) * 1.7;
        return fahrenheit;
    }

    public static int[] jahresrechner(long minuten){

        int[] jahreMonateTageStundenMinuten = new int[5];
        jahreMonateTageStundenMinuten[0] = (int) minuten/525600;// Umrechnung, wie viel Jahre, Kommarest abschneiden
        minuten = minuten%525600;                               // Verbleibender Rest nach Division
        jahreMonateTageStundenMinuten[1] = (int) minuten/43800;
        minuten = minuten%43800;
        jahreMonateTageStundenMinuten[2] = (int) minuten/1440;
        minuten = minuten% 1440;
        jahreMonateTageStundenMinuten[3] = (int) minuten/60;
        jahreMonateTageStundenMinuten[4] =(int) minuten%60;

        return jahreMonateTageStundenMinuten;
    }

    public static double bmiRechner(double groesse, double gewicht){
        double bmi = gewicht/(Math.pow(groesse,2));     // gewicht / größe^2
        return (Math.round(bmi*10)/10);                 // runde auf 1 Nachkommastelle
    }

    public static void bmiEinschaetzung(double bmi){
        if(bmi<16){
            System.out.println(bmi+" => Starkes Untergewicht");
        }
        else if (bmi>16 && bmi <= 16.9){
            System.out.println(bmi+" Maessiges Untergewicht");
        }
        else if(bmi >= 17 && bmi <= 18.4){
            System.out.println(bmi+" Leichtes Untergewicht");
        }
        else if(bmi >=18.5 && bmi <=24.9){
            System.out.println(bmi+" Normalgewicht");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.println(bmi+" Praeadipositas");
        }
        else if(bmi >= 30 && bmi <= 34.9){
            System.out.println(bmi+ " Adipositas Grad I");
        }
        else if(bmi >= 35 && bmi <= 39.9){
            System.out.println(bmi+" Adipositas Grad II");
        }
        else if(bmi >= 40){
            System.out.println(bmi+" Adipositas Grad III");
        }
        else
            System.out.println("Error "+bmi);
    }
}
