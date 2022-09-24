public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,3,5,7,9};
        int aranacak = 5;
        for(int sayi : sayilar){
            if(sayi == aranacak){
                System.out.println("Sayı vardır.");
                break;
            }
        }
    }
}