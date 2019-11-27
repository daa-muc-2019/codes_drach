import java.util.Scanner;

public class Beispiel{
	public static void main(String[] args){
	
		Scanner namevomScanner = new Scanner(System.in);
		//String name = new String();
		//Soldat max = new Soldat();
		
		String wort = namevomScanner.next();
		String satz = namevomScanner.nextLine();
		
		System.out.println(wort+"\n"+satz);
		
	}
}