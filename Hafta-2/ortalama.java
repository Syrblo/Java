import java.util.Scanner;
public class ortalama {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        int not1, not2, ortalama;

        System.out.print("1. not: ");
        not1 = giris.nextInt();

        System.out.print("2. not: ");
        not2 = giris.nextInt();

        ortalama = (not1 + not2)/2;
        System.out.println("Ortalama: "+ortalama);
    }
}
