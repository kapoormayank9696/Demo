// Sequential Search Algorithm Implementation In Java

import java.util.Scanner;
public class CharceterSearch{

    // Method to perform the sequentail search algorithm
    public static int index(String str,char s){
        for(int i=0;i<str.length();i++){
            if(s == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    
    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter a character to search : ");
        char s=sc.next().charAt(0);
        int result = index(str,s);
        if(result != -1){
            System.out.println("Target element character is : "+result);
        }else{
            System.out.println("Target character cannot exist");
        }
        sc.close();
    }
}

