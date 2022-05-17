import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter String: ");
        String myString = keyboard.nextLine();
        System.out.println(longerThen20(myString));
    }

    public static boolean longerThen20(String s) {
       return s.length() > 20 &&  s.contains("fancy");
    }
}
