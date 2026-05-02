// Integers Divisible By 9 Between 100 And 200 Algorithm Implementation In Java
public class Integers_Divisible {
    // Main function
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Integers divisible by 9 between 100 and 200: ");
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nThe sum : " + sum);
    }
}
