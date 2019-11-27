public class Mails {
    static int neueNachrichten = 5;
    static String neueNachricht = "Ich bin eine Mail!";

    public static void main(String[] args){
        neueMailsAnzeigen();
    }

    public static void neueMailsAnzeigen(){
        System.out.println("Willkommen in Ihrem Mailaccount!");
        if(neueNachrichten > 0){
            zeigeNeueNachrichten();
        }
        else{
            System.out.println("Sie haben keine neuen Mails.");
        }
    }
    public static void zeigeNeueNachrichten(){
        System.out.println("Sie haben neue Nachrichten.");
        while (neueNachrichten > 0){
            System.out.println(neueNachricht);
            neueNachrichten--;
        }
    }
}
