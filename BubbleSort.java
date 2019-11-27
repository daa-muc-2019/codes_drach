public class BubbleSort{

	public static void main(String args[]){
		
		double[] liste = {0.6, 3.9, 6.6, 9.6, 10.9, 19.8, 18.9, 19, 14.1, 15.1, 10.7, 5.3, 3.8};
		
		double[] sortierteListe = sortierer(liste);
		for(int i = 0; i < sortierteListe.length; i++){
			System.out.println(sortierteListe[i]);
		}
	
	}
	
	public static double[] sortierer(double[] liste){
		double tmp;
		for(int j = liste.length-1; j > 0; j--){
		//j = 3
			for(int i = 0; i < j ; i++){
				// jedes i wird durchgerechnet i = 0 .... i = j
				
				// nächste eintrag= aktuelle position(i) + 1
				// wenn in i = 5, dann ist i+1 = 6
				if(liste[i] > liste[i+1]){
				// vertausche a und b
					tmp = liste[i];
					liste[i] = liste[i+1];
					liste[i+1] = tmp;
	}
				
				//vergleiche aktuelle Position mit nächster
				
				//Wenn aktuelle Position größer als nächste Position, dann
				// speicher aktuelle Position in nächste Position && nächste Position in aktueller
				
			}
		
		}
		return liste;
	}

}