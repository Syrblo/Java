import java.util.Scanner;

public class hipo {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        double dik, yatay;
        double hipo;
        System.out.print("dik uzunluk: ");
        dik = giris.nextDouble();

        System.out.print("yatay uzunluk: ");
        yatay = giris.nextDouble();

        hipo = Math.sqrt(dik*dik + yatay*yatay);
        System.out.println("hipotenüs: " + hipo);
    }
}
