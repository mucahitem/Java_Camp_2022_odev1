public class Main {
    public static void main(String[] args) {
        String anneKizlikSoyadi = "abcdabcdabcd";
        String guvenlikSorusu = "Anne kızlık soyadının 3. ve 5. harfleri nedir? ";


        //System.out.println(guvenlikSorusu);
        //System.out.println(anneKizlikSoyadi.charAt(2) + " ve " + anneKizlikSoyadi.charAt(4));


        String mesaj_ = anneKizlikSoyadi.charAt(2) + " ve " + anneKizlikSoyadi.charAt(4);
        System.out.println(guvenlikSorusu.concat(mesaj_));

        System.out.println(anneKizlikSoyadi.startsWith("a"));
        System.out.println(anneKizlikSoyadi.endsWith("k"));

        char[] harfler = new char[2];
        anneKizlikSoyadi.getChars(0, 2, harfler, 0);
        System.out.println(harfler);

        System.out.println(anneKizlikSoyadi.indexOf('b'));
        System.out.println(anneKizlikSoyadi.lastIndexOf('b'));

        ////////////////////////////////////

        String mesaj1 = "           Çok güzel bir gün!      ";
        System.out.println(mesaj1.replace('ü','u'));
        System.out.println(mesaj1.substring(4,6));

        for(String kelime: mesaj1.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj1.toLowerCase());
        System.out.println(mesaj1.toUpperCase());
        System.out.println(mesaj1.trim());







    }



}