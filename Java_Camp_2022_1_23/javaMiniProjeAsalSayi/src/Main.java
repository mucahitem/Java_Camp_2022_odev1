public class Main {
    public static void main(String[] args) {
        int number = 1;
        if(number==1){
            System.out.println("1 asal sayı değildir.");
            return;
        }
        if(number<1){
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }
        boolean asalMi = true;
        for(int i = 1; i<number; i++){
            if(number % i == 0){
                asalMi = false;
            }
        }
        if(asalMi == true){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
    }
}