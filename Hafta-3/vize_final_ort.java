import java.util.Scanner;
public class vize_final_ort {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        double vize, final_not;
        double ortalama;

        System.out.print("Vize not: ");
        vize = giris.nextDouble();
        while(vize<= 0){
            System.out.println("Hatalı giriş tekrar deneyin: ");
            vize = giris.nextDouble();
        }

        System.out.print("Final not: ");
        final_not = giris.nextDouble();
        while(final_not<= 0){
            System.out.println("Hatalı giriş tekrar deneyin: ");
            final_not = giris.nextDouble();
        }

        ortalama = (vize*0.4)+(final_not*0.6);
        System.out.println("Ortalama: "+ortalama);

        if(ortalama >= 70)
            System.out.println("Başarılı");
        else
            System.out.println("Başarısız");
    }
}