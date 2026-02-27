import java.util.Scanner;

public class tekCift {
    public static void main(String[] args){
        int sayi, kalan;
        System.out.println("Sayıyı gir: ");
        Scanner giris = new Scanner(System.in);
        
        sayi = giris.nextInt();
        kalan = sayi % 2;

        if(kalan==0){
            System.out.println("Sayı ÇİFTTİR.");
        }else{
            System.out.println("Sayı TEKTİR.");
        }
    }
}
