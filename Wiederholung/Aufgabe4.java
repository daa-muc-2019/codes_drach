public class Aufgabe4 {
    public static void main(String[] args){
        int[] zahlen = {2,4,1,7,5,9};
        int[] zahlen2 = {1,2,3,4};
        int[] sortiert = sortierer(zahlen);
        for(int i = 0; i<zahlen.length;i++) {
            System.out.print(sortiert[i]+" ");
        }
        System.out.println("\n");
        System.out.println(durchschnitt(zahlen));
        System.out.println(durchschnitt2(zahlen));
        System.out.println(checkForNumber(zahlen,2));
        int[] schnittmenge = schnittmenge(zahlen,zahlen2);
        for(int i = 0; i<schnittmenge.length;i++){
            System.out.print(schnittmenge[i]+" ");
        }
    }

    public static int[] sortierer(int[] array){
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j<i; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
    public static double durchschnitt(int[] zahlen){
        double summe = 0;
        for(int i = 0; i< zahlen.length;i++){
            summe += zahlen[i];
        }
        double durchschnitt = summe / zahlen.length;
        return durchschnitt;
    }
    public static double durchschnitt2(int[] zahlen){
        zahlen = sortierer(zahlen);
        double summe = 0;
        for(int i = 1; i< zahlen.length-1;i++){
            summe += zahlen[i];
        }
        double durchschnitt = summe / (zahlen.length-2);
        return durchschnitt;
    }
    public static boolean checkForNumber(int[] array, int zahl){
        for (int i = 0; i< array.length;i++){
            if(array[i] == zahl){
                return true;
            }
        }
        return false;
    }
    public static int[] schnittmenge(int[] array1,int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }
        int[] schnittmenge = new int[counter];
        counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    schnittmenge[counter] = array1[i];
                    counter++;
                }
            }
        }
        return schnittmenge;
    }
}
