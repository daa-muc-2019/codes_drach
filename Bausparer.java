/*
Zinsen = 3,5%
Laufzeit = 5 Jahren = 60 Monate
monatliche Einzahlung = 300 €
Kontostand = 0 €

1) jeden monat:
	konto + monatliche Einzalung;
	
2) wenn 1 Jahr vorbei: 
	ist aktueller monat durch 12 teilbar
	wenn ja:
	--> dann Zinsen drauf
	(Kontostand = Kontostand * 1.035
	wenn nein:
	--> nix

3) Wiederhole bis 5 Jahre abgelaufen



*/
public class Bausparer{
	public static void main(String[] args){
		double zinsen = 1.035;
		int laufzeit = 60;
		int monatlicheEinzahlung = 300;
		double kontostand = 0.0;
		
		for(int i=1;i<=laufzeit;i++){
			//kontostand += monatlicheEinzahlung;
			kontostand = kontostand+monatlicheEinzahlung;
			//System.out.println(kontostand);
			if(i%12 == 0){
				//kontostand *= zinsen;
				kontostand = kontostand * zinsen;
			}
		}
System.out.println("Nach "+laufzeit/12+" Jahren wurden "+kontostand+" Euro angespart!");		
	
	
	
	
	
	
	}
}