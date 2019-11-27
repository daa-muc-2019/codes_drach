public class Verbrauch{
	public static void main(String args[]){
		
		double benzinPro100 = 6.8;
		double benzinProKM =(double) Math.round(6.8*100)/10000;
		
		double oelPro1000 = 0.5;
		double oelProKM = 0.5/1000;
		
		double fahrtStreckeEinfach = 100.0;
		
		double benzinPreisLiter = 1.207;
		double oelPreis = 37.47;
		double oelPreisLiter = 37.47/5;
		
		double benzinVerbrauch = benzinProKM * fahrtStreckeEinfach;
		double benzinKosten = benzinPreisLiter * fahrtStreckeEinfach;
		benzinKosten = (double) Math.round(benzinKosten * 100) /100;
		double oelVerbrauch = oelProKM * fahrtStreckeEinfach;
		double oelKosten = oelPreisLiter * fahrtStreckeEinfach;
		oelKosten = (double) Math.round(oelKosten * 100) / 100;
		
		System.out.print("Eine Strecke von "+fahrtStreckeEinfach+" km verbraucht:\n"+benzinVerbrauch+" L Benzin \n"+oelVerbrauch+" L Oel \nUnd Kostet: \nBenzin: "+benzinKosten+" Euro \nOel: "+oelKosten+" Euro\n\n");	
	}
}