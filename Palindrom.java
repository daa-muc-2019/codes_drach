import java.util.Scanner;
public class Palindrom {

  public static void main(String[] args){
      System.out.println("Bitte geben Sie ein Wort ein, das auf Palindrom getestet werden soll: ");
      String wort = wortLesen(); //Methodenaufruf
      char[] wortArray = new char[wort.length()]; // um auf die Einzelnen Buchstaben zugreifen zu können,
      for (int i = 0; i <= wort.length()-1;i++) { // wird der String Wort in seine einzelnen Chars zerlegt,
          wortArray[i] = Character.toLowerCase(wort.charAt(i)); //die in ein Array eingefügt werden
      }
        boolean ergebnis = palindromTest(wortArray); //Methodenaufruf
        if(ergebnis==true){
            System.out.println("Das Wort "+wort+" ist ein Palindrom!");
        }
        else{
            System.out.println("Das Wort "+wort+" ist KEIN Palindrom");
        }
    }
    public static String wortLesen(){
      /*
      Methode zum Einlesen von Wörtern,
      fängt primitive Fehler ab
       */
      try {
          Scanner eingabe = new Scanner(System.in);
          String wort = eingabe.next();
          return(wort);
      }
      catch(Exception e){
          System.out.println("Bitte geben Sie ein Wort ein: ");
          return(wortLesen());
        }
    }

    public static boolean palindromTest(char[] wort) {
      /*
      Methode zum Abgleich der einzelnen Buchstaben,
      liefert einen boolean true, falls Palindrom,
      false falls kein Palindrom
       */
        if(wort.length%2 == 0) { //Fallunterscheidung zwischen Wörtern mit geraden und ungeraden Buchstaben
            for (int i = 0; i < wort.length / 2; i++) { //Wort muss nur bis zur Hälfe überprüft werden
                if (wort[i] != wort[wort.length - 1 - i]) { //Vergleich des vordesten und hintersten Buchstaben
                    return false; //Vorzeitiger Schleifenabbruch, falls keine Übereinstimmung vorliegt
                }
            }
        }
        else{
            for (int i = 0; i < wort.length / 2; i++) {
                if (wort[i] != wort[wort.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true; //Wenn die Schleife komplett durchgelaufen ist, muss ein Palindrom vorliegen
    }
}

