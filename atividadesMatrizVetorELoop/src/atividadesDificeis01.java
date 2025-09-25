public class atividadesDificeis01 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                String print = "0";
                if(l == c){
                    print = "1";
                }
                System.out.printf(" %s ", print);
            }
            System.out.println();
        }

    }
}
