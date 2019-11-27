/*7. Schreiben Sie eine Klasse Sortierer, das drei Variablen a,b und c der
Größe nach sortiert*/

public class Sortierer {
	public static void main(String args[]){
		int x = 60, y = 3, z = 2;
		
		// x < y < z 
		int[] listeMitErgebnissen = sortierung(x,y,z);
		
		for(int i = 0; i < listeMitErgebnissen.length;i++){
			System.out.println(listeMitErgebnissen[i]);
		}
		//System.out.println(a + "<"+b+"<"+c);
	}
	
	public static int[] sortierung (int a, int b, int c){
		int[] ergebnisListe = new int[3];
		if(a>b){
			// vertausche a und b
			int tmp = a;
			a = b;
			b = tmp;
		}
		if(a>c){
			int tmp = a; // a=3
			a = c;		// c = 2
			c = tmp;
		}	
		if (b>c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		ergebnisListe[0] = a;
		ergebnisListe[1] = b;
		ergebnisListe[2] = c;		
		return ergebnisListe; //
	}
}
