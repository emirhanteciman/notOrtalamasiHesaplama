import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int kimya,fizik,biyoloji,turkce,matematik,muzik,cografya;

        Scanner ort = new Scanner(System.in);

        System.out.println("Ortalama hesaplama programına hoşgeldiniz");

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = ort.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = ort.nextInt();
        System.out.println("Biyoloji notunuzu giriniz: ");
        biyoloji = ort.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = ort.nextInt();
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = ort.nextInt();
        System.out.println("Muzik notunuzu giriniz: ");
        muzik = ort.nextInt();
        System.out.println("Coğrafya notunuzu giriniz: ");
        cografya = ort.nextInt();

    int  ortalama = (kimya + fizik + biyoloji + turkce + matematik + muzik + cografya)/7;
        System.out.println("Not ortalamanız: " + ortalama);
    }
}