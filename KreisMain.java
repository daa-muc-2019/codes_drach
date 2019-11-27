public class KreisMain {
    public static void main(String[] args){
        Kreis ersterKreis = new Kreis(2.5,3,3);
        Kreis zweiterKreis = new Kreis(6,2.5,-5.5);
        ersterKreis.setFlaechenInhalt();
        System.out.println(ersterKreis.getFlaechenInhalt());

        System.out.println(zweiterKreis.getxKoordinate());
        zweiterKreis.setxKoordinate(ersterKreis.getxKoordinate());
        System.out.println(zweiterKreis.getxKoordinate());
        zweiterKreis.setUmfang();
        System.out.println(zweiterKreis.getUmfang());

        Kreis dritterKreis = new Kreis(-6,1,2.5);
        dritterKreis.setUmfang();
        dritterKreis.setFlaechenInhalt();
        System.out.println(dritterKreis.getUmfang());
    }
}
