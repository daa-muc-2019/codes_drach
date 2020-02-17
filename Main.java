import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> gruppe1 = new ArrayList<String>(List.of("Freibert","Sommerer","Lehnhäuser","Zanker"));
        ArrayList<String> gruppe2 = new ArrayList<String>(List.of("Ender","Giereth","Harter","Hosch","Kurt","Riedel","Will","Gerull"));
        ArrayList<String> gruppe3 = new ArrayList<String>(List.of("Svistunova","Bohlmann","Welling","Diemar","Plohotnikov","Schlegel","Wegmann","Partyka"));
        ArrayList<String> gruppe4 = new ArrayList<String>(List.of("Seibold","Bredau","Fritz","König"));

        Random randInt = new Random();

        while(gruppe1.size()>0){
            int nmr = randInt.nextInt(gruppe1.size());
            System.out.print(gruppe1.get(nmr)+" ");
            gruppe1.remove(nmr);
            nmr = randInt.nextInt(gruppe2.size());
            System.out.print(gruppe2.get(nmr)+" ");
            gruppe2.remove(nmr);
            nmr = randInt.nextInt(gruppe3.size());
            System.out.print(gruppe3.get(nmr)+" ");
            gruppe3.remove(nmr);
            nmr = randInt.nextInt(gruppe4.size());
            System.out.print(gruppe4.get(nmr)+"\n");
            gruppe4.remove(nmr);
        }
        while (gruppe2.size()>0){
            int nmr = randInt.nextInt(gruppe2.size());
            System.out.print(gruppe2.get(nmr)+" ");
            gruppe2.remove(nmr);
            nmr = randInt.nextInt(gruppe2.size());
            System.out.print(gruppe2.get(nmr)+" ");
            gruppe2.remove(nmr);
            nmr = randInt.nextInt(gruppe3.size());
            System.out.print(gruppe3.get(nmr)+" ");
            gruppe3.remove(nmr);
            nmr = randInt.nextInt(gruppe3.size());
            System.out.print(gruppe3.get(nmr)+"\n");
            gruppe3.remove(nmr);
        }
    }
}
