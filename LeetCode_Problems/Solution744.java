// LeetCode Problem 744: Find Smallest Letter Greater Than Target

import java.util.Arrays;
import java.util.Scanner;
public class Solution744 {

    // Method to find greater letter of target element
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(letters[mid] <= target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start % letters.length];
    }

    // Method to print an array
    public static void printArray(char[] letters){
        for(char letter:letters){
            System.out.print(letter+" ");
        }
        System.out.print("\n");
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter letters: ");
        char[] letters=new char[n];
        for(int i=0;i<n;i++){
            letters[i]=sc.next().charAt(0);
        }
        Arrays.sort(letters);
        System.out.print("Display the character array: ");
        printArray(letters);
        System.out.print("Enter target character: ");
        char target=sc.next().charAt(0);
        char result=nextGreatestLetter(letters, target);
        System.out.print("Greater character of the target character: "+result);
        sc.close();
    }
}
