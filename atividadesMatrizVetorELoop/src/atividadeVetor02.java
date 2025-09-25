import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class atividadeVetor02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[15];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else{
                impares.add(numeros[i]);
            }
        }

        System.out.printf("Dos números %s, são pares %s, e impares %s", Arrays.toString(numeros), pares.toString(), impares.toString());

    }
}
