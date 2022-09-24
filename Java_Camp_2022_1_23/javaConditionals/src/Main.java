public class Main {
    public static void main(String[] args) {
        int sayi = 55;
        int sinirDeger = 8885;
        if(sayi<sinirDeger){
            System.out.println("girdiğiniz sayı " + sinirDeger + "'den küçük!");
        }
        else if(sayi == sinirDeger){
            System.out.println("Girdiğiniz sayı " + sinirDeger + " ile eşdeğer!");
        }
        //direkt else de gelebilir.
        else if (sayi>sinirDeger){
            System.out.println("Girdiğiniz sayı " + sinirDeger + "'den büyük!");
        }
    }
}