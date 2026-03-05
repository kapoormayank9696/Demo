// Reverse the array Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    //  Function to reverse the array
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> list=new ArrayList<>();
        int k=0;
        for(int i=a.size()-1;i>=0;i--) {
            list.add(k,a.get(i));
            k++;
        }
        return list;
    }

    // Main Function
    @SuppressWarnings({"unused", "ConvertToTryWithResources"})
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array: ");
        int n=Integer.parseInt(br.readLine());
        List<Integer> arr=new ArrayList<>();
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++) {
            // Integer.decode() is a method of the Java (programming language) 
            // Integer class that converts a String into an integer, but it 
            // also understands different number formats.
            arr.add(Integer.decode(br.readLine()));
        }
        System.out.println("Original Array Print: "+ arr);
        arr=reverseArray(arr);
        System.out.println("Reverse order to print the array: "+arr);
        br.close();
    }
}
