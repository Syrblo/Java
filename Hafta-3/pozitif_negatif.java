import java.util.Scanner;

public class pozitif_negatif {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayi gir: ");
        sayi = giris.nextInt();

        if(sayi<0)
            System.out.println("Sayi negatiftir.");
        if(sayi>0)
            System.out.println("Sayi pozitiftir.");
        if(sayi==0)
            System.out.println("Sayi sıfırdır.");
    }
}
