public class Main {
    public static void main(String[] args){
        GleichseitigesDreieck dreieck1 = new GleichseitigesDreieck(5);
        GleichseitigesDreieck dreieck2 = new GleichseitigesDreieck(6);
        Quadrat quadrat1 = new Quadrat(4);
        Quadrat quadrat2 = new Quadrat(7);

        System.out.println(quadrat1.getAnzahlSeiten());
        System.out.println(quadrat1.getInnenWinkel());
        System.out.println(quadrat1.getSeitenLaenge());
        System.out.println(quadrat1.getUmfang());

        System.out.println(dreieck1.getAnzahlSeiten());
        System.out.println(dreieck1.getInnenWinkel());
        System.out.println(dreieck1.getSeitenLaenge());
        System.out.println(dreieck1.getUmfang());

        GleichseitigesVieleck[] vieleckArray = {dreieck1,dreieck2,quadrat1,quadrat2};


        System.out.println(insgesamtSeiten(vieleckArray));

    }
    public static int insgesamtSeiten (GleichseitigesVieleck[] vieleckArray) {
        int summe = 0;
        for (int i = 0; i < vieleckArray.length; i++){
            summe += vieleckArray[i].getSeitenLaenge();
        }
        return summe;
    }

}
