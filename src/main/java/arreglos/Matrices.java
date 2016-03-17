package arreglos;

/**
 * Created by maliaga on 16-03-16.
 */
public class Matrices {

    public int[][] getMatriz() {
        int matriz[][] = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        return matriz;
    }
}
