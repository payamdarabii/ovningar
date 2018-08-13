import java.util.Scanner;

public class Kokavatten {
    public static void main(String[] args) {
        System.out.println("hur många grader är vattnet");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 100) {
            System.out.println("vattnen kokar");
        } else if (i>=50) {
            System.out.println("den är halvägs");
        } else {
            System.out.println("Vattnet kokar inte");

        }

    }
}





