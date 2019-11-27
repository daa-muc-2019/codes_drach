/*
8. Machen Sie sich mit dem Objekt „Scanner“ vertraut. Wofür kann dieses
verwendet werden?
Schreiben Sie eine Klasse Ratespiel, bei der der Benutzer aufgefordert wird,
die interne Zahl zu erraten. Beim Gelingen soll der Spieler beglückwunscht
werden, wenn er falsch liegt soll er als Tipp bekommen, ob die gesuchte Zahl
größer oder kleiner der eingegebenen Zahl ist.
Für Experten: Machen Sie sich mit dem Objekt „Random“ vertraut. Lassen
Sie die Zahl zufällig generieren. Fügen Sie Grenzen hinzu, die Sie dem
Spieler mitteilen und führen Sie Versuchsanzahlen ein.
*/

import java.util.Scanner;

public class Ratespiel{
	public static void main(String args[]){
		Scanner neuerScanner = new Scanner(System.in);
		System.out.println("Bitte erraten Sie die interne Zahl!");
		int rateZahl = 0;  //Initialisierung mit 0 um in While zu springen
		int richtigeZahl = 6;
		while(rateZahl!=richtigeZahl){
			rateZahl = neuerScanner.nextInt();
			if ( rateZahl<richtigeZahl){
				System.out.println("Falsch, die gesuchte Zahl ist größer!");
			}
			else if (rateZahl>richtigeZahl){
				System.out.println("Falsch, die gesuchte Zahl ist kleiner!");
			}
		}
		System.out.println("Richtig! Glückwunsch!");
	
	
	
	
	}
}