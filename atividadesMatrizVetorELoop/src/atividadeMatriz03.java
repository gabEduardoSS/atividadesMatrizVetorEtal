import java.util.Scanner;

public class atividadeMatriz03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print("Insira um valor: ");
                matriz[l][c] = input.nextInt();
            }
        }

        for(int l = 0; l < matriz.length; l++) {
            int somaLinha = 0;
            for (int c = 0; c < matriz[0].length; c++) {
                somaLinha += matriz[l][c];
            }
            System.out.printf("A soma da %dª linha é: %d %n", l + 1, somaLinha);
        }

        /*for(int c = 0; c < matriz[0].length; c++) {
            int somaColuna = 0;
            for (int l = 0; l < matriz.length; l++) {
                somaColuna += matriz[l][c];
            }
            System.out.printf("A soma da %dª coluna é: %d %n", c + 1, somaColuna);
        }*/

        int[] somaColunas = {0, 0, 0};
        for(int l = 0; l < matriz.length; l++){
            int somaLinha = 0;
            for(int c = 0; c < matriz[0].length; c++){
                somaColunas[c] += matriz[l][c];
                somaLinha += matriz[l][c];
            }
            System.out.printf("A soma da %dª linha é: %d %n", l+1, somaLinha);
            if(l == matriz.length-1){
                for(int i = 0; i < somaColunas.length; i++){
                    System.out.printf("A soma da %dª coluna é: %d %n", i+1, somaColunas[i]);
                }
            }
        }

    }
}
