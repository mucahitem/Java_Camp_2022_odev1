public class Main {
    public static void main(String[] args) {
        char grade = 'd';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Mükemmel!");
                break;

            case 'B':
            case 'b':
                System.out.println("İyi!");
                break;

            case 'C':
            case 'c':
                System.out.println("Fena değil!");
                break;

            case 'D':
            case 'd':
                System.out.println("Vasat!");
                break;

            case 'E':
            case 'e':
                System.out.println("Kötü!");
                break;

            case 'F':
            case 'f':
                System.out.println("Çok kötü!");
                break;
            default:
                System.out.println("Lütfen geçerli bir veri giriniz!");

        }
    }
}