//Aufgabe 1
import java.io.File;																				//Neue Datei
import java.io.FileOutputStream;																	//Datei schreiben
import java.io.IOException;																			//Datei suchen
import java.util.Scanner;																			//Scanner




public class FileHandling {
	public static void main(String[]args) throws IOException {
		
		

		
		File folder1=new File("./neuerOrdner");							//Ordner erstellen, Java io File
		File file1=new File("./neuerOrdner/neuerText.txt");					//Dokument erstellen, Java io File
		
		
//Aufgabe 2		
		
		if(folder1.exists())																		//Ordner pr�fen
			System.out.println("Ordner existiert.");
		else {
			folder1.mkdirs();
			System.out.println("Ordner wurde neu erstellt.");
		}
		
		if(file1.exists()){																			//Datei pr�fen
			System.out.println("Datei existiert.");
		}
		else {
			file1.createNewFile();
			System.out.println("Datei wurde neu erstellt.");
		}
		
		
//Aufgabe 3		
																								
		FileOutputStream schreiben=new FileOutputStream(file1);										//Datei  schreiben
			
		Scanner scanner1=new Scanner(System.in);
		System.out.println(">>>>>>>>>>Bitte geben Sie den neuen Text ein.<<<<<<<<<<");
		String textInhalt= scanner1.nextLine();
		textInhalt = textInhalt +"\n";
			
		schreiben.write(textInhalt.getBytes());
		schreiben.close();
		
		
//Aufgabe 4		
		
		Scanner sc=new Scanner(file1);																//Dokument lesen
		
		while(sc.hasNext()) {	
			System.out.print(sc.next() + " ");														//Anf�hrungsstriche f�r Leerzeichen bei Ausgabe
		}
		sc.close();

		
//Aufgabe 5		

		FileOutputStream ergaenzen = new FileOutputStream(file1, true);									//Text hinzuf�gen
		
		Scanner scanner2=new Scanner(System.in);		
		System.out.println("Bitte erg�nzen Sie Ihren Text.");
		String ergaenzung=scanner2.nextLine();
		ergaenzung = ergaenzung + "\n";
		
		ergaenzen.write(ergaenzung.getBytes(), 0, ergaenzung.length());
		ergaenzen.close();
		
		
//Aufgabe 6		
		
		Scanner scanner3=new Scanner(System.in);
		System.out.println("M�chten Sie die Dateien l�schen?");
		String antwort=scanner3.next();
		
		if(antwort.equals("Ja")) {				
			file1.delete();																			//Dateien l�schen
			folder1.delete();
		
			if(folder1.exists())																	//L�schvorgang pr�fen
				System.out.println("Ordner existiert noch.");
			else
				System.out.println("Dateien wurden gel�scht.");
		}
		else
			System.out.println("Dateien werden gespeichert.");
	}
}