public class Kombinatorik {
    public static void main(String[] args){
        String password = "94625";
        int[] zahlen = {1,2,3,4,5,6,7,8,9,0};
        //int kombinationen = 0;
        for(int zahl1:zahlen){
            for(int zahl2:zahlen){
                for(int zahl3:zahlen){
                    /*if(zahl1 != zahl2 && zahl1 != zahl3 && zahl2!= zahl3){
                        System.out.println(zahl1 + " "+ zahl2 + " "+ zahl3);
                        kombinationen++;*/
                    for(int zahl4: zahlen){for(int zahl5:zahlen){
                    String passwordtest = Integer.toString(zahl1)+Integer.toString(zahl2)+Integer.toString(zahl3)+Integer.toString(zahl4)+Integer.toString(zahl5);
                    if(passwordtest.equals(password)){
                        System.out.println("Gefunden! "+passwordtest);
                    }}}
                }
            }
        }
        //System.out.println("Kombinationsmöglichkeiten: "+kombinationen);
    }
}
