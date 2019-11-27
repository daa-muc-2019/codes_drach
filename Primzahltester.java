import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Primzahltester {

    public static void main(String[] args){
        int n = zahlEinlesen();
        int t = 0;
        int i = 1;
        while (i <= n){
            if(n % i == 0){
                t++;
            }
            i++;
        }
        if(t == 2){
            System.out.println(n+" ist eine Primzahl");
        }
        else{
            System.out.println(n+" ist keine Primzahl");
        }


    }

    public static int zahlEinlesen(){
        Scanner eingabe = new Scanner(System.in);
        int eingegebeneZahl = 0;
        try{
            eingegebeneZahl = eingabe.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Bitte geben Sie eine ganze Zahl groesser 0 ein!");
            zahlEinlesen();
        }
        if(eingegebeneZahl<=0){
            System.out.println("Bitte geben Sie eine positive Zahl ein: ");
            zahlEinlesen();
        }
        eingabe.close();
        return(eingegebeneZahl);
    }

}
