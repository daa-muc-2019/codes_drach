import java.util.Scanner;
public class Switchcases {

    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie zwei Zahlen ein: ");
        int zahl1 = eingabe.nextInt();
        int zahl2 = eingabe.nextInt();
        int identifier=0;

        if (zahl1!=zahl2){
            if(zahl1<zahl2){
                identifier=0;
            }
            if(zahl1>zahl2){
                identifier=1;
            }
        }
        else{
            identifier=3;
        }


        switch(identifier) {
            case(0):
                System.out.println(zahl1+" != "+zahl2+"\n"+zahl1+" <= "+zahl2+"\n"+zahl1+" < "+zahl2+"\n");
                break;
            case(1):
                System.out.println(zahl1+" != "+zahl2+"\n"+zahl1+" >= "+zahl2+"\n"+zahl1+" > "+zahl2+"\n");
                break;
            case(2):
                System.out.println(zahl1+" == "+zahl2+"\n"+zahl1+" <= "+zahl2+"\n"+zahl1+" >= "+zahl2+"\n");
                break;

        }
    }
}
