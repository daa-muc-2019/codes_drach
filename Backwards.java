import java.util.Scanner;
//Buchstaben, Leerzeichen, Zahlen und Sonderzeichen

public class Backwards {
    public static void main(String[] args){
        Scanner eingabeLeser = new Scanner(System.in);
        String eingabe = eingabeLeser.nextLine();
        char[] buchstaben = eingabe.toCharArray();
        char[] rueckwaerts = new char[buchstaben.length];
        int laenge = buchstaben.length-1;
        for(char buchstabe:buchstaben){
            rueckwaerts[laenge] = buchstabe;
            laenge--;
        }
        for (char c:rueckwaerts) {
            System.out.print(c);
        }
        System.out.println("\nBuchstaben: "+buchstabenZaehlen(buchstaben));
        System.out.println("Leerzeichen: "+leerzeichenZaehlen(buchstaben));
        System.out.println("Zahlen: "+zahlenZaehlen(buchstaben));
        System.out.println("Sonderzeichen: "+sonderzeichenZaehlen(buchstaben,(leerzeichenZaehlen(buchstaben) + zahlenZaehlen(buchstaben) + buchstabenZaehlen(buchstaben))));
    }
    public static int leerzeichenZaehlen(char[] buchstaben){
        int i = 0;
        for(char c: buchstaben){
            if (c == ' '){
                i++;
            }
        }
        return i;
    }
    public static int zahlenZaehlen(char[] buchstaben){
        int i = 0;
        for (char c: buchstaben){
            if(c == '0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'){
                i++;
            }
        }
        return i;
    }
    public static int buchstabenZaehlen(char[] buchstaben){
        int i = 0;
        for (char c: buchstaben){
            if(Character.isLetter(c)){
                i++;
            }
        }
        return i;
    }
    public static int sonderzeichenZaehlen(char[]buchstaben, int rest){
        int i = buchstaben.length;
        i -= rest;
        return i;
    }
}
