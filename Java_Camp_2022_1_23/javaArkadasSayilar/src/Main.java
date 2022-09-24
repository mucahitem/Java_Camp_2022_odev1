public class Main {
    public static void main(String[] args) {
        int sayi1 = 220;
        int toplam1 = 0;

        int sayi2 = 284;
        int toplam2 = 0;

        for(int i=1; i<sayi1; i++){
            if(sayi1 % i == 0){
                toplam1 = toplam1 + i;
            }
        }

        for(int a=1; a<sayi2; a++){
            if(sayi2 % a == 0){
                toplam2 = toplam2 + a;
            }
        }

        if(toplam1 == sayi2 && toplam2 == sayi1){
            System.out.println("Bu iki sayı arkadaştır.");
        }
        else{
            System.out.println("Bu iki sayı arkadaş değildir.");
        }
    }
}