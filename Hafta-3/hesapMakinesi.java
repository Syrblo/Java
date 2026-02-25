import java.util.Scanner;

public class hesapMakinesi{
    public static void main(String[] args) {
        double sayi1, sayi2;
        char islem;
        Scanner giris = new Scanner(System.in);

        System.out.print("Yaz: ");
        sayi1 = giris.nextDouble();
        islem = giris.next().charAt(0);
        sayi2 = giris.nextDouble();

        if(islem == '+') 
            System.out.println("Sonuç: " + (sayi1 + sayi2));

        if(islem == '-') 
            System.out.println("Sonuç: " + (sayi1 - sayi2));

        if(islem == '*') 
            System.out.println("Sonuç: " + (sayi1 * sayi2));

        if(islem == '/') {
            while(sayi2 == 0) {
                System.out.println("Sıfıra bölme hatası!\n Tekrar giriniz: ");
                sayi2 = giris.nextDouble();
            }
                System.out.println("Sonuç: " + (sayi1 / sayi2));
        }
        
    }
}

