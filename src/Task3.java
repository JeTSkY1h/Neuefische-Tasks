import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("first number: ");
        int wertA = keyboard.nextInt();
        System.out.print("Second number: ");
        int wertB = keyboard.nextInt();

        if (wertA == wertB) {
            System.out.println("Die Zahlen sind gleich Groß");
        }
        if(wertA < wertB) {
            System.out.println("Zahl 1 ist Kleiner");
        } else {
            System.out.println("Zahl 1 ist größer");
        }

    }
}
