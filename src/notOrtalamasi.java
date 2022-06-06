import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        // Değişken değerleri bulalım
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri alalım
        System.out.print("Matematik Notunuzu Giriniz; ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz; ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz; ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz; ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz; ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz; ");
        muzik = inp.nextInt();

        // Alınan değerlerin toplamı
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);

        // Alınan değerlerin ortalaması ve ekrana bastırılması
        double sonuc = ( toplam / 6.0);
        System.out.println("Derslerinizin ortalaması:" +sonuc);

        /** Doğru mu Yanlış mı 60'tan küçük eşitse doğru değilse yanlış.
         * Bunu aynı şekilde büyük eşit için de yapabiliriz.
         * o zaman 60'a eşit veya büyük durumunda Sınıfı Geçtiniz kısmı önce yazılır.
         * yani kod şöyle olacaktı.
         * boolean gecer = sonuc >= 60;
         * String str = gecer ? "Sınıfı Geçtiniz :)" : "Sınıfta Kaldınız :(";
         * System.out.println(str);
         */
        boolean gecer = sonuc <= 60 ;

        String str = gecer ? "Sınıfta Kaldınız :(" : "Sınıfı Geçtiniz :)";
        System.out.println(str);


    }
}