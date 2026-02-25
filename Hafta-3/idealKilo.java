import java.util.Scanner;

public class idealKilo {
    public static void main(String[] args) {
        double ideal, kilo, boy, yas, k=0;
        char cinsiyet;
        Scanner giris = new Scanner(System.in);

        System.out.println("Kilo: ");
        kilo = giris.nextDouble();
        System.out.println("Boy: ");
        boy = giris.nextDouble();
        System.out.println("Yaş: ");
        yas = giris.nextDouble();
        System.out.println("Cinsiye (E/K): ");
        cinsiyet = giris.next().charAt(0);
        if(cinsiyet == 'e' || cinsiyet == 'E')
            k = 0.9;
        if(cinsiyet == 'k' || cinsiyet == 'K')
            k = 0.8;

        ideal = (((boy-100) + (yas/10)) * k);
        System.out.println("ideal kilonuz: " + ideal);

        System.out.println("Yapılması gereken: ");
        if(ideal<kilo){
            System.out.printf("%.2f", (kilo-ideal));
            System.out.printf(" kilo verilmeli");
        }
        if(ideal>kilo)
            System.out.println((ideal-kilo)+"kilo alınmalı");
        if(ideal==kilo)
            System.out.println("Tam ideal kilodasın takıl kafana göre.");
    }
}
