import java.util.Scanner;

public class Hasttokig {
    public static void main(String[] args) {
        System.out.println("Hur gammal är du? ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 12) {
            System.out.println("DU FÅR INTE TÄVLA!!!");
        } else if (i >= 12) {
            System.out.println("Du får tävla");
            System.out.println("Vad är din viktklass");
            int vikt = sc.nextInt();
            if (vikt <= 30) {
                System.out.println("Du får rida Ponny.A");
            } else if (vikt <= 50 && vikt > 30) {
                System.out.println("Du får rida Ponny.B");
            } else if (vikt < 65 && vikt > 50) {
                System.out.println("Du får rida Ponny.C");
            } else {
                System.out.println("Du får inte rida banta först");


            }

        }
    }
}