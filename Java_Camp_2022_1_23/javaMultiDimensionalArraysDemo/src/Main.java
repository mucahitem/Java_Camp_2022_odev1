public class Main {
    public static void main(String[] args) {
        String [][] satranc = new String[2][2];
        satranc [0][0] ="A1";
        satranc [0][1] ="A2";
        satranc [1][0] ="B1";
        satranc [1][1] ="B2";

        for(int i = 0; i<=1; i++){
            System.out.println("==========================================");
            for(int j = 0; j<= 1; j++){
                System.out.println(satranc[i][j]);
            }
        }
        System.out.println("============================================");
        System.out.println("============================================");

        String[][][] ucBoyut = new String[2][2][2];
        ucBoyut[0][0][0]="X:0, Y:0, Z:0";
        ucBoyut[1][0][0]="X:1, Y:0, Z:0";
        ucBoyut[1][1][0]="X:1, Y:1, Z:0";
        ucBoyut[1][1][1]="X:1, Y:1, Z:1";
        ucBoyut[0][1][0]="X:0, Y:1, Z:0";
        ucBoyut[0][1][1]="X:0, Y:1, Z:1";
        ucBoyut[0][0][1]="X:0, Y:0, Z:1";
        ucBoyut[1][0][1]="X:1, Y:0, Z:1";

        for(int x = 0; x<=1; x++){
            for(int y = 0; y<=1; y++){
                for(int z = 0; z<=1; z++){
                    System.out.println(ucBoyut[x][y][z]);
                }
            }
        }


    }
}