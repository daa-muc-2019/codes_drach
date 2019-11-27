/* Klasse Bausparkonto
Verzinsung fest auf 3.5 % (jährlich)
Einzahlung = 300€
Laufzeit = 5 Jahre = 60 Monate

fehlt eine Variable

jeden der 60 monate:
	einzahlung +300€
	wenn Jahresende:
		dann Zinsen aufrechnen



*/

public class Bausparkonto{
	public static void main(String args[]){
		double verzinsung = 1.035;
		int monatlicheEinzahlung = 300;
		int laufzeit = 60;
		
		double kontostand = 0;
		
		int monate = 1; 
		// == ; != ; < ; > ; <= ; >= 
		while(monate <= laufzeit){ //Schleifendurchlauf = Iteration
			kontostand = kontostand + monatlicheEinzahlung;	//+300€
			
			if(monate%12 == 0){ 	//Jahresende
				
				kontostand *= verzinsung; // kontostand = kontostand + kontostand*verzinsung
				System.out.println("nach "+monate/12+" Jahren sind "+kontostand+" Euro auf dem Konto");
			}
			monate++;

			//System.out.println("Nach "+monate+" Monate sind "+kontostand+" Euro auf dem Konto!");
		}
		System.out.println("\n \nNach "+laufzeit+" Monate sind "+kontostand+" Euro auf dem Konto!");
		
		
	}
}