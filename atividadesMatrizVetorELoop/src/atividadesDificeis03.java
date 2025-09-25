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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] matriz = {{" ", "|", " ", "|", " "},
                            {"—", "+", "—", "+", "—"},
                            {" ", "|", " ", "|", " "},
                            {"—", "+", "—", "+", "—"},
                            {" ", "|", " ", "|", " "}};

        boolean acabou = false;
        int jogadas = 0;
        do{
            for (String[] strings : matriz) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.printf(" %s ", strings[c]);
                }
                System.out.println();
            }
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
            if(jogadas >= 9){
                break;
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

        } while (acabou == false);

    }
}

