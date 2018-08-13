import java.util.Scanner;

public class Bada {
    public static void main(String[] args) {
        boolean vatten = true;
        System.out.println("finns det vatten ");
        Scanner sc = new Scanner(System.in);
        boolean bn = sc.nextBoolean();
        if (bn == true) {
            System.out.println("jag det finns vatten");

        } else {
            System.out.println("Nej det finns inte vatten");

        }
        String grader = sc.next();
        System.out.println("hur många grader är det i vattnet");
        int x = sc.nextInt();
        if (x == 30) {
            System.out.println("varsågod och bada");
        } else if (x == 20) {
            System.out.println("de går inte och bada");
        } else {
            System.out.println("Vattnen finns inte ");


        }

    }

}