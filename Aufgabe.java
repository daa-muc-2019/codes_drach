public class Aufgabe{
	public static void main(String[] args){
		double[] umsaetze =  {2000.0, 1000.0, 4000.0, 5000.0};
		System.out.println(ermittleQuartalsUmsatz(umsaetze));
		System.out.println(ermittleMaxUmsatz(umsaetze));
	}
	public static double ermittleQuartalsUmsatz(double[] umsaetze){
		double umsatzQuartal = 0.0;
		int i = 0;
		while (i<=umsaetze.length-1) {
			umsatzQuartal += umsaetze[i];
			i++;
		}
		return umsatzQuartal;
	}
	public static double ermittleMaxUmsatz(double[] umsaetze){
		double maxUmsatz = umsaetze[0]; //maxUmsatz = 0.0;
		for(int i = 0; i < umsaetze.length; i++) {
			if (maxUmsatz < umsaetze[i]) {
				maxUmsatz = umsaetze[i];
			}
		}
		return maxUmsatz;
	}
}