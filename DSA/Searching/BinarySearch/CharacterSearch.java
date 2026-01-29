// Character Search Algorithm Implementation In Java By Using Binary Search

import java.util.Arrays;
import java.util.Scanner;
public class CharacterSearch {

    // Method to perform an character search algorithm
    public static int characterSearch(char[] chars,char s){
        int start = 0;
        int end = chars.length-1;
        while(start <= end){
            int mid = start+(end - start)/2;
            if(s < chars[mid]){
                end = mid-1;
            }else if(s > chars[mid]){
                start = mid+1;
            }else{
                return mid;
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

    // Method to print an sort charcter array
    public static void printArray(char[] chars){
        for(char s:chars){
            System.out.print(s);
        }
        System.out.println("\n");
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Print Original String: ");
        printString(str);
        System.out.print("Enter a character to search : ");
        char s=sc.next().charAt(0);
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.print("After sorted a string: ");
        printArray(chars);
        int result = characterSearch(chars, s);
        if(result != -1){
            System.out.println("Target element character is: "+result);
        }else{
            System.out.println("Target character cannot exist!!!");
        }
        sc.close();
    }
}
