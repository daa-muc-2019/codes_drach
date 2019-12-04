public class Bank {
    public static void main(String[] args){
        BankKonto normalesKonto = new BankKonto();
        BankKonto normalesKonto2 = new BankKonto(500.00);
        normalesKonto.abheben(200);
        System.out.println(normalesKonto.getKontostand());

        SparKonto meinSparKonto = new SparKonto();
        SparKonto meinSparKonto2 = new SparKonto(500,0.05);

        meinSparKonto.zinsenAnrechnen();
        meinSparKonto2.zinsenAnrechnen();
        System.out.println(meinSparKonto.getKontostand());
        System.out.println(meinSparKonto2.getKontostand());

        GiroKonto meinGiroKonto = new GiroKonto();
        GiroKonto meinGiroKonto2 = new GiroKonto(500,0.5);

        meinGiroKonto.abheben(300);
        meinGiroKonto2.einzahlen(50);

        System.out.println(meinGiroKonto.getKontostand());
        System.out.println(meinGiroKonto2.getKontostand());

    }
}
