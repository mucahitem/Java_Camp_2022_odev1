public class Main {
    public static void main(String[] args) {
        String[] elemanlar = new String[4];
        elemanlar[0]="Ali";
        elemanlar[1]="Ayşe";
        elemanlar[2]="Ece";
        elemanlar[3]="Kaan";

        //System.out.println(elemanlar[3]);

        for(int i=0; i<elemanlar.length;i++){
            System.out.println(elemanlar[i]);
        }
        System.out.println("====================================================");

        for(String eleman: elemanlar){
            System.out.println(eleman);
        }


    }
}