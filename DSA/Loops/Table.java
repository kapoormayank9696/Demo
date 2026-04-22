// Table Print Algorithm Implementation In Java
public class Table {
    // Function to print the multiplication table of a given number
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Main function
    public static void main(String[] args) {
        int number = 5; // You can change this number to print the table of any other number
        printTable(number);
    }
}
