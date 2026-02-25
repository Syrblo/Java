import java.util.Scanner;

public class maas {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        int saat, maas;
        System.out.print("Kaç saat çalışıldı: ");
        saat = giris.nextInt();

        maas = saat*100;
        System.out.println("brüt maaş:" + maas);
        System.out.println("sigorta primi:" + maas*0.15);
        System.out.println("vergi:" + maas*0.10);
        System.out.println("net maaş:" + maas*0.75);
    }
}