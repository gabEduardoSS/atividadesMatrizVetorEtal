import java.util.Scanner;

public class atividadesDificeis02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print("Insira um valor: ");
                matriz[l][c] = input.nextInt();
            }
        }

        System.out.printf("Essa é sua matriz: %n");
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.printf(" %s ", matriz[l][c]);
            }
            System.out.println();
        }
        System.out.printf("Sua transposição ficaria: %n");
        for(int l = 0; l < matriz[0].length; l++){
            for(int c = 0; c < matriz.length; c++){
                System.out.printf(" %s ", matriz[c][l]);
            }
            System.out.println();
        }
    }
}
