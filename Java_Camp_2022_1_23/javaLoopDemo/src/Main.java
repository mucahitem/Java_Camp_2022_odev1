public class Main {
    public static void main(String[] args) {
        //for
        for(int i = -5 ; i<=10 ; i++){
            System.out.println(i);
        }
        for(int i = -5 ; i<=10 ; i+=3){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti!");
        System.out.println("==========================================================");

        //while
        int i = 1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti!");
        System.out.println("==========================================================");

        //Do While
        int a = 40;
        do{
            System.out.println("Loglandı!");
            if(a<10) {
                System.out.println(a);
                a++;
            }
        }while(a<10);
        System.out.println("Do While döngüsü bitti!");
    }
}