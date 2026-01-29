// Character Search Algorithm Implementation In Java By Using Linear Search

import java.util.Scanner;
public class CharacterSearch {

    // Method to perform an character search algorithm
    public static int characterSearch(String str,char s){
        for(int i=0;i<str.length();i++){
            if(s == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    // Method to print a string
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("\n");
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Enter a character to search : ");
        char s=sc.next().charAt(0);
        printString(str);
        int result = characterSearch(str, s);
        if(result != -1){
            System.out.println("Target element character is: "+result);
        }else{
            System.out.println("Target character cannot exist!!!");
        }
        sc.close();
    }
}
