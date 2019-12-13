import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args){
        Scanner eingabeScanner = new Scanner(System.in);
        int eingabeZahl = eingabeScanner.nextInt();
        System.out.println(fakRek(eingabeZahl));
        System.out.println(fakIterativ(eingabeZahl));
    }
    public static int fakRek(int zahl){
        if(zahl==1){
            return(1);
        }
        else{
            return(fakRek(zahl-1)*zahl);
        }
    }
    public static int fakIterativ(int zahl){
        for(int i = zahl-1;i>=1;i--){
            zahl *= i;
        }
        return zahl;
    }

}
