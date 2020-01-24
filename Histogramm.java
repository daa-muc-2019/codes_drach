public class Histogramm {
    public static void main(String[] args){
        double[] data1 = {
                1.1, 1.9, 2.2, 3.0, 5.1, 5.2, 4.3, 0.1, 4.5, 5.1
        };
        double[] data2 = {
                8.0, 6.0, 4.0, 1.0, 2.0, 3.0, 4.0, 9.0
        };
        printCharMatrix(charArray(arrayRunden(data1),maxWert(arrayRunden(data1))));
        System.out.println();
        printCharMatrix(charArray(arrayRunden(data2),maxWert(arrayRunden(data2))));
        System.out.println();
        printCharMatrix(groesterFlaecheninhalt(charArray(arrayRunden(data1),maxWert(arrayRunden(data1))),maxWert(arrayRunden(data1))));

    }

    public static int[] arrayRunden(double[] array){
        int[] arrayGerundet = new int[array.length];
        for (int i=0; i<array.length;i++){
            arrayGerundet[i] = (int) Math.round(array[i]);
        }
        return arrayGerundet;
    }
    public static int maxWert(int[] array){
        int maxWert = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i] > maxWert){
                maxWert=array[i];
            }
        }
        return maxWert;
    }
    public static char[][] charArray(int[] array, int maxWert){
        char[][] charMatrix = new char[maxWert][array.length];
        for(int i = 0; i < maxWert;i++){
            for(int j = 0; j < array.length;j++){
                if(array[j]>= maxWert-i){
                    charMatrix[i][j] = '*';
                }
                else{
                    charMatrix[i][j] = ' ';
                }
            }
        }
        return charMatrix;
    }

    public static void printCharMatrix(char[][] charMatrix){
        for (int i = 0; i< charMatrix.length;i++){
            for (int j = 0; j< charMatrix[i].length; j++){
                System.out.print(charMatrix[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] groesterFlaecheninhalt(char[][] charMatrix, int maxWert){
        int flaechenInhalt = 0;
        int xKoordinate = 0;
        int yKoordinate = 0;
        int echteNachbarn = 0;
        int z = 0;
        for (int i = 0; i< charMatrix.length;i++){
            for (int j = 0; j< charMatrix[i].length; j++){
                if(charMatrix[i][j] == '*'){
                    z = countNachbarn(charMatrix,j,i);
                    int lokalA = (z+1) * (maxWert-i);
                    if(lokalA > flaechenInhalt){
                        xKoordinate = j;
                        yKoordinate = i;
                        flaechenInhalt = lokalA;
                        echteNachbarn = z;
                    }
                }

            }
        }
        return(sterneUeberschreiben(charMatrix, xKoordinate, yKoordinate, echteNachbarn));
    }

    public static int countNachbarn(char[][] charmatrix, int xKoordinate, int yKoordinate){
        int nachbarn = 0;
        for(int i = xKoordinate; i<charmatrix[yKoordinate].length-1;i++){
            try {
                if (charmatrix[yKoordinate][i + 1] == '*') {
                    nachbarn++;
                } else {
                    return nachbarn;
                }
            }
            catch (IndexOutOfBoundsException ioob){
                return nachbarn;
            }
        }

        return nachbarn;
    }

    public static char[][] sterneUeberschreiben(char[][] charMatrix, int xKoordinate, int yKoordinate, int z){
        for(int i = yKoordinate; i < charMatrix.length; i++){
            for(int j = xKoordinate; j < xKoordinate+z+1;j++){
                charMatrix[i][j] = '0';


            }
        }
        return charMatrix;
    }
}
