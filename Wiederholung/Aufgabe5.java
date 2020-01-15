import java.util.Scanner;

public class Aufgabe5 {
    static Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Bitte geben Sie 3 Zahlen ein: ");
        int zahl1 = eingabe.nextInt();
        int zahl2 = eingabe.nextInt();
        int zahl3 = eingabe.nextInt();
        System.out.println(kleinsteZahl(zahl1,zahl2,zahl3));
        System.out.println(durchschnitt(zahl1,zahl2,zahl3));
        passwordEingabe();
    }
    public static int kleinsteZahl(int zahl1, int zahl2, int zahl3){
        if(zahl1 < zahl2 && zahl1 < zahl3){
            return zahl1;
        }
        else if(zahl2 < zahl1 && zahl2 < zahl3){
            return zahl2;
        }
        else if(zahl3 < zahl1 && zahl3 < zahl2){
            return zahl3;
        }
        else{
            if(zahl1 == zahl2 || zahl1 == zahl3){
                return zahl1;
            }
            else {
                return zahl2;
            }
        }
    }
    public static double durchschnitt(int zahl1, int zahl2, int zahl3){
        int summe = zahl1 + zahl2 + zahl3;
        return(summe/3);
    }

    public static void passwordEingabe(){
        System.out.println("Bitte geben Sie ein Password ein: ");
        String pw = eingabe.nextLine();
        boolean check = true;
        check = achtZeichen(pw);
        if (!check){
            passwordEingabe();
        }
        check = buchstabenUndZeichen(pw);
        if (!check){
            passwordEingabe();
        }
        check = mindZweiZahlen(pw);
        if (!check){
            passwordEingabe();
        }
        else {
            System.out.println("gültiges Passwort");
            System.exit(1);
        }
    }
    public static boolean achtZeichen(String pw){
        if(pw.length()<8){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean buchstabenUndZeichen(String pw){
        char[] pwArray = pw.toCharArray();
        for(int i = 0; i< pwArray.length;i++){
            if((!Character.isLetter(pwArray[i]))&&(!Character.isDigit(pwArray[i]))){
                return false;
            }
        }
        return true;
    }

    public static boolean mindZweiZahlen(String pw){
        char[] pwArray = pw.toCharArray();
        int counter = 0;
        for(int i = 0; i<pwArray.length;i++){
            if(Character.isDigit(pwArray[i])){
                counter++;
            }
        }
        if(counter>1){
            return true;
        }
        else{
            return false;
        }
    }
}
