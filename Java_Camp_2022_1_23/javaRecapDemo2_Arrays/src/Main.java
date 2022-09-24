public class Main {
    public static void main(String[] args) {
        //double[] mylist = new double[7];
        double mylist[] = {1.5, 10.2, 6.8, 0.5};
        double total = 0;
        double max = mylist[0];


        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);


        }
        System.out.println("=====================");
        System.out.println("Toplam = " + total);
        System.out.println("En büyük sayı = " + max);
    }
}