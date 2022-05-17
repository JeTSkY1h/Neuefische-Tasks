public class Task4 {
    public static void main(String[] args) {
        System.out.println(mytoString(getSum(15,15)));
    }

    public static int getSum(int valueA, int valueB) {
        return valueB + valueA;
    }

    public static String mytoString (int value) {
        return "Summe: " + value;
    }
}
