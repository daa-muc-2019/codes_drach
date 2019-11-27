public class BausparerWhile{
	public static void main(String args[]){
		int laufZeit = 60;
		int monatZahlung = 300;
		double zinsen = 1.035;
		double guthaben = 0.0;
		int aktuellerMonat = 1;
		
		while(aktuellerMonat<=laufZeit){
			guthaben += monatZahlung;
			if(aktuellerMonat%12 == 0){
				guthaben *= zinsen;
			}
			aktuellerMonat++;
		}
		System.out.println("Nach "+laufZeit/12 +" Jahren wurde "+guthaben+" angespart");
	}
}