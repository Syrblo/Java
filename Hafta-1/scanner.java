import java.util.Scanner;

public class scanner {
    public static void  main(String[] args){
        Scanner giris=new Scanner(System.in);
        
        int sayi1, sayi2, toplam;
        System.out.print("Lutfen sayi1 giriniz: ");
        sayi1 = giris.nextInt();
        
        System.out.print("Lutfen sayi2 giriniz: ");
        sayi2 = giris.nextInt();
        
        toplam = sayi1+sayi2;
        System.out.println("Sayilarin toplami: " + toplam);
    }

}
