public class Main {
    public static void main(String[] args) {
        int sayi = 6;
        int total = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total = total + i;
            }
        }
        if (total == sayi) {
            System.out.println(sayi + " sayısı mükemmel sayıdır.");

        } else {
            System.out.println(sayi + " sayısı mükemmel sayı değildir.");
        }

    }
}