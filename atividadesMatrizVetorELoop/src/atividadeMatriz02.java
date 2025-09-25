import java.util.Scanner;

public class atividadeMatriz02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf("Insira um número na posição [%d,%d] da matriz: ", r+1, c+1);
                matriz[r][c] = input.nextInt();
            }
        }
        System.out.println("A diagonal principal da sua matriz é:");
            for (int r = 0; r < matriz.length; r++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    String print = " ";
                    if(r == c){
                        print = Integer.toString(matriz[r][c]);
                    }
                    System.out.printf(" %s ", print);
                }
                System.out.println();
            }


    }
}
