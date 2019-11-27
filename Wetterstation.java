/*
Temperaturen = [0.6,3.9, 6.6, 9.6, 10.9, 19.8, 18.9, 19, 14.1, 15.1, 10.7, 5.3, 3.8]
Höchsttemperatur
niedrigste
Durchschnitt = Summe von allen / Anzahl
*/

public class Wetterstation{
	public static void main(String args[]){
	
	//Liste deklarieren & initialisieren
	double[] temperaturen = {-0.6, 3.9, 6.6, 9.6, 10.9, 19.8, 18.9, 19, 14.1, 15.1, 10.7, 5.3, 3.8};
	double[] temperaturen2 = {0.6, 3.9, 6.6, 9.6, 10.9, 19.8, 18.9, 19, 14.1, 15.1, 10.7, 5.3, 3.8};
	String[] monate = {"Januar","Februar", "März","April", "Mai", "Juni", "Juli", "August","September", "Oktober","November","Dezember","Schmezember"};
	//Methoden aufrufen
	double errechneterDurchschnitt = durschnittBerechnen(temperaturen);
		
	System.out.println(durschnittBerechnen(temperaturen));
	
	//double[] hoechsterWert = hoechstTemperatur(temperaturen);
	
	double[] hoechsteTemperaturenListe = hoechstTemperatur(temperaturen);
	int positionHoechsteTemperatur =(int) hoechsteTemperaturenListe[1];
	System.out.println("Die hoechste Temperatur war "+hoechsteTemperaturenListe[0]+" im Monat "+monate[positionHoechsteTemperatur]);
	System.out.println(hoechstTemperatur(temperaturen));
	

	}
	
	//methode 1: Durchschnitt
	public static double durschnittBerechnen(double[] jahresTemperaturen){
		/* Berechnet den Durchschnitt des Arrays,
		indem alle Elemente summiert werden, und dann durch die Anzahl geteilt wird
		*/
		double insgesamteTemperaturen = 0.0;   //Variable zum Speichern der Summe
		for (int i = 0; i < jahresTemperaturen.length; i++) {
			// liste[0] - liste[1] --- liste[12]
			insgesamteTemperaturen += jahresTemperaturen[i];  //Aufsummieren aller Werte in insgesamteTemperaturen
			//double aktuellerWert = jahresTemperaturen[i];
			//insgesamteTemperaturen = insgesamteTemperaturen + aktuellerWert;
		}
		double durchschnitt = (double) insgesamteTemperaturen/jahresTemperaturen.length; //Berechnung des Durchschnitts
		return(durchschnitt); //Rückgabe des Durchschnitts an main methode
	}
	
	//Methode 2: höchste Temperaturen
	public static double[] hoechstTemperatur(double[] jahresTemperaturen){
		
		//Hilfvariable vom Typ double deklarieren & initialisieren, in der der höchste Wert gespeichert wird
		// double speicher = 0.0
		double hoch = jahresTemperaturen[0]; //zwischenspeicher
		int position = 0;  					 //zwischenspeicher des Index
		double[] ergebnis = new double[2];	 // [0] = temperatur, [1] = Index
		// über die Liste Laufen
		// für (jedes element in liste) mach:
		for (int i = 0; i < jahresTemperaturen.length; i++){
			
			// vergleichen, ist aktueller Wert der Liste > aktuell gespeicherter Wert
			// wenn speicher < aktueller Wert dann: speicher = aktueller Wert 
			//liste[5]
			//liste[i] -> i= 1, i=2 , ... , i= 13
			
			if(hoch < jahresTemperaturen[i]){
				hoch = jahresTemperaturen[i];
				position = i;
			}
		
		}
		ergebnis[0] = hoch;
		ergebnis[1] = (double) position;
		
		return(ergebnis);
		
	
	}
	//Methode 3: niedrigste Temperatur
	public static double niedrigsteTemperatur(double[] jahresTemperaturen){
		
		//Hilfsvariable vom Typ double deklarieren, für niedrigsten Wert
		double niedrigsterWert = jahresTemperaturen[0];
		//über Liste laufen
		for (int i=0;i<jahresTemperaturen.length;i++){
				if (niedrigsterWert>jahresTemperaturen[i]){
					niedrigsterWert=jahresTemperaturen[i];
				}
		}
		
		//vergleichen, wenn aktueller Wert der Liste < hilfsvariable
		
		// hilfsvariable = aktuellerWert
		
		
		
		return niedrigsterWert;	
	
	}
	
}