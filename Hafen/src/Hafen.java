public class Hafen {
    public static void main(String[] args){
        Schiff schiff1 = new Schiff(50);
        schiff1.beladen(20);
        System.out.println(schiff1.antriebAusgeben());

        Motorschiff motorschiff = new Motorschiff(500,20);
        System.out.println(motorschiff.antriebAusgeben());

        Segelschiff segler = new Segelschiff(20,40);
        System.out.println(segler.antriebAusgeben());
    }
}
