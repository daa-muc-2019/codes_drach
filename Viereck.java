public class Viereck {
    /*1.1 Erstellen Sie zunächst die main-Methode,
    in der ein Viereck mit den Werten Breite b = 4 und Höhe h = 6
    angelegt wird. Außerdem soll in der main-Methode
    die Methoden zur Berechnung des Flächeninhalts und des
    Umfangs aufgerufen werden.
     */
   public static void main(String[] args){
        double b = 4;
        double h = 6;
        System.out.println(flaechenInhaltBerechnen(-4,5));
        System.out.println(umfangBerechnen(3,-6));
        double flaeche = flaechenInhaltBerechnen(b,h);
        double umfang = umfangBerechnen(b,h);
        System.out.println("Der Flaecheninhalt ist: "+flaeche+"\nund der Umfang: "+umfang);

   }
   /*1.2 Erstellen Sie anschließend die Methode flaechenInhaltBerechnen.
   Diese Methode benötigt als Argument die Breite und Höhe des Vierecks.
   Der Flächeninhalt wird berechnet,
   indem Höhe und Breite miteinander multipliziertwerden. (A = b * h)*/

   public static double flaechenInhaltBerechnen(double b, double h){
       if(b<0 || h<0) {
           return 0;
       }
       double a = b * h;
       return a;
   }

   public static double umfangBerechnen(double breite, double hoehe){
       if (breite<0 || hoehe <0){
           return 0;
       }
       double umfang = 2 * (breite+hoehe);
       return umfang;
   }

}
