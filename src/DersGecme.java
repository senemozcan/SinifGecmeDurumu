import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DersGecme {
    public DersGecme() throws NumberFormatException, IOException {
        String[] dersler = { "Matematik", "Fizik", "Kimya", "Biyoloji", "Edebiyat", "Türkçe", "İngilizce", "Sosyal" };
        int[] notlar = new int[8];
        int total = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < notlar.length; i++) {
            System.out.println("Lütfen " + dersler[i] + " dersi için notunuzu giriniz.");
            notlar[i] = Integer.parseInt(bf.readLine());

            if (notlar[i] > 100 || notlar[i] < 0) {
                System.out.println("Lütfen 0-100 aralığında bir sayı giriniz.");
                while (notlar[i] < 0 || notlar[i] > 100) {
                    System.out.println("Lütfen " + dersler[i] + " dersi için notunuzu giriniz.");
                    notlar[i] = Integer.parseInt(bf.readLine());
                }

            }

            total += notlar[i];

        }
        if (total / notlar.length >= 50) {
            System.out.println("Geçti");
        }
    }
}