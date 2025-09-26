// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Arrays;
import java.util.Scanner;

public class atividadesDificeis03 {
    public static int[] posicao(String[][] matriz, int[] coord){
        for(int i = 0; i < coord.length; i++){
            if(1 > coord[i] || coord[i] > 3){
                System.out.println("Posição inválida!!");
                return new int[]{-1, -1};
            }
            switch(coord[i]){
                case 1:
                    coord[i] = 0;
                    break;
                case 3:
                    coord[i] = 4;
                    break;
            }
            if(Arrays.asList(new String[]{"X", "O"}).contains(matriz[coord[0]][coord[1]])){
                System.out.println("Posição já está preenchida!!");
                return new int[]{-1, -1};
            }
        }

        return new int[]{coord[0], coord[1]};
    }
    
    public static String[] verVitoria(String[][] matriz){
        String[] val = {"X", "O"};
        boolean venceu = false;
        for (int i = 0; i < 2; i++){
            String[] linha = matriz[i];
            String[] coluna = {linha[0], linha[1], linha[2]};
            String[] diagonal1 = {matriz[0][0], matriz[1][1], matriz[2][2]};
            String[] diagonal2 = {matriz[0][2], matriz[1][1], matriz[2][0]};
            String[][] verificar = {linha, coluna, diagonal1, diagonal2};
            for(String[] v : verificar){
                if (v[0] == val[i] && v[1] == val[i] && v[2] == val[i]){
                    return new String[] {"verdadeiro", val[i]};
                }
            }
        }
        return new String[] {"falso", ""};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] matriz = {{" ", "|", " ", "|", " "},
                            {"—", "+", "—", "+", "—"},
                            {" ", "|", " ", "|", " "},
                            {"—", "+", "—", "+", "—"},
                            {" ", "|", " ", "|", " "}};
        verVitoria(matriz);

        boolean acabou = false;
        int jogadas = 0;
        
        do{
            for (String[] strings : matriz) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.printf(" %s ", strings[c]);
                }
                System.out.println();
            }
            if (jogadas < 9){
                do{
                    System.out.print("Onde o X quer jogar?(linha, coluna): ");
                    String[] sPosX = input.nextLine().strip().replaceAll("[^0-9,]", "").split(",");
                    int[] posX = posicao(matriz, new int[]{Integer.parseInt(sPosX[0]), Integer.parseInt(sPosX[1])});
    
                    if(posX[0] != -1) {
                        matriz[posX[0]][posX[1]] = "X";
                        jogadas++;
                        break;
                    }
                } while(true);
                
                String[] vit = verVitoria(matriz);
                if (vit[0] == "verdadeiro"){
                    System.out.printf("O jogador %s ganhou", vit[1]);
                    break;
                }
                if(jogadas == 9){
                    continue;
                }
                for (String[] strings : matriz) {
                    for (int c = 0; c < matriz[0].length; c++) {
                        System.out.printf(" %s ", strings[c]);
                    }
                    System.out.println();
                }
                do{
                    System.out.print("Onde o O quer jogar?(linha, coluna): ");
                    String[] sPosO = input.nextLine().strip().replaceAll("[^0-9,]", "").split(",");
                    int[] posO = posicao(matriz, new int[]{Integer.parseInt(sPosO[0]), Integer.parseInt(sPosO[1])});
    
                    if(posO[0] != -1) {
                        matriz[posO[0]][posO[1]] = "O";
                        jogadas++;
                        break;
                    }
                } while(true);
                vit = verVitoria(matriz);
                if (vit[0] == "verdadeiro"){
                    System.out.printf("O jogador %s ganhou", vit[1]);
                    break;
                }
            }
            else{
                break;
            }
        } while (acabou == false);

    }
}
