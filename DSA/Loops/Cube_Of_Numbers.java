// Cube Of Numbers Algorithm Implementation In Java

import java.util.Scanner;
public class Cube_Of_Numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int cube = i * i * i; // cube = num * num * num
                System.out.println("Cube of " + i + " is: " + cube);
            }
        }
    }
}
