public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[r][c] == 0) {

                }else {
                    matriz[r][c] = 1;
                }
            }
        }
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[r][c] + " ");
            }
            System.out.println();
        }
    }
}