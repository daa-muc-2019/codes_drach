public class Bausparkonto{
	public static void main(String[] args){
		//Variablendeklaration:
		int laufZeit = 60;
		int monatZahlung = 300;
		double zinsen = 0.035;
	
		double guthaben = 0.0;
	
		for(int i = 0;i <= laufZeit;i++){
			guthaben = guthaben + monatZahlung;
			//System.out.println(guthaben);
			if (laufZeit%12 == 0) { //Ende des Jahres
				guthaben =(double) Math.round((guthaben + (guthaben * zinsen))*100)/100;
			}
		}
		System.out.println("Nach "+laufZeit/12 +" Jahren wurde "+guthaben+" angespart");
	}
}
