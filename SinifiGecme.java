import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0, ders = 0;
        double ortalama;
        System.out.println("Matematik Ders Notu:");
        int mat = scan.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            ders++;
        }
        System.out.println("Fizik Ders Notu:");
        int fizik = scan.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            ders++;
        }
        System.out.println("Kimya Ders Notu:");
        int kimya = scan.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            ders++;
        }
        System.out.println("Türkçe Ders Notu:");
        int turkce = scan.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            ders++;
        }

        System.out.println("Müzik Ders Notu:");
        int muzik = scan.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            ders++;
        }
        System.out.println(toplam +","+ ders);
        
        ortalama = toplam / ders;
        System.out.println("Ortalama: " + ortalama);
        if (ortalama < 55)
            System.out.println("Sınfta kaldı.");
        else
            System.out.println("Sınfı geçti.");
    }
}
