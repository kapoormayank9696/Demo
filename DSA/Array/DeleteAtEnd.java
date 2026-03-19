// Delete Element From End Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class DeleteAtEnd {
    // Function to delete the end element from an array
    public static int[] deleteAtEnd(int[] num){
        if(num.length <= 1){
            return new int[0];
        }
        int[] nums=new int[num.length-1];
        // num ---> Original Array , start copying index ---> 0
        // nums ---> new Array ,start placing index ---> 0,length ---> num.length-1
        System.arraycopy(num, 0, nums, 0, num.length-1);
        return nums;
    }

    // Main function
    public static void main(String[] args) throws Exception {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            int[] num=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display the array: "+Arrays.toString(num));
            num=deleteAtEnd(num);
            System.out.println("After deleting the first element array is: "+Arrays.toString(num));
        }
    }
}

