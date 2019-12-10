import java.util.Scanner;
import java.util.Random;
public class ZooMain {
    static Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wilkommen im Zoo!\nWas soll gemacht werden?\n-besuchen\n-verlassen");
        String befehl = eingabe.next();

        if (befehl.equals("verlassen") || befehl.equals("v")) {
            System.exit(0);
        } else {
            //Tier besuchsTier = tierAuswahl();
            //tierBesuchen(besuchsTier);
            tierAuswahl();
        }
    }

    public static void tierBesuchen(Tier tier){
        System.out.println(infoSchild(tier));
        if(!tier.getIsHappy()){
            System.out.println(tier.getName()+" schaut nicht glücklich aus!");
        }
        else{
            System.out.println(tier.getName()+" sieht heute glücklich aus!");
        }
        //Thread.sleep(500);
        Random randInt = new Random();
        int luckyNumber = randInt.nextInt(10);

        if(luckyNumber == tier.luckyNumber){
            tier.performAction();
        }
        System.out.println("Was soll gemacht werden?\n-warten\n-besuchen\n-verlassen");
        String befehl = eingabe.next();
        if(befehl.equals("warten")||befehl.equals("w")){
            tierBesuchen(tier);
        }
        else if(befehl.equals("besuchen")||befehl.equals("b")){
            //Tier besuchsTier = tierAuswahl();
            tierAuswahl();
           // tierBesuchen(besuchsTier);

        }
        else{
            System.exit(0);
        }
    }
    public static void tierAuswahl(){
        System.out.println("Welches Tier soll besucht werden?\n"); //tiere einfügen
        String besuchsTier = eingabe.next();
        switch(besuchsTier){
            case "Affe":
                Affe affe1 = new Affe(3);
                tierBesuchen(affe1);


                break;
            case "Schlange":

                break;
            default:
                System.out.println("Dieses Tier wurde nicht gefunden!");
                tierAuswahl();
        }

    }

    public static String infoSchild(Tier tier){
        return("Name: "+tier.getName()+"\nAlter: "+tier.getAlter());
    }

}
