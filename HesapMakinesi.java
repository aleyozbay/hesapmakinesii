import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları ve operatörü al
        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Operatörü girin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // İşlemi gerçekleştir ve sonucu ekrana yazdır
        double sonuc = hesapla(sayi1, sayi2, operator);
        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }

    public static double hesapla(double sayi1, double sayi2, char operator) {
        double sonuc = 0.0;

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Bölme işlemi sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("Hata: Geçersiz operatör girişi!");
                break;
        }

        return sonuc;
    }
}