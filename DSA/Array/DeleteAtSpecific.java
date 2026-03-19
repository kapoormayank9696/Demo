// Delete Element From Specific Position Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class DeleteAtSpecific {
    // Function to delete the specific position element from an array
    public static int[] deleteAtSpecific(int[] num,int index){
        if(num.length <= 1 || index < 0 || index >= num.length){
            return new int[0];
        }
        int[] nums=new int[num.length-1];
        // num ---> Original Array , start copying index ---> 0
        // nums ---> new Array ,start placing index ---> 0,length ---> num.length-1

        // Copy elements before index
        System.arraycopy(num, 0, nums, 0, index);
        // Copy elements after index
        System.arraycopy(num, index+1, nums, index, num.length-index-1);
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
            System.out.print("Enter an index: ");
            int index=Integer.parseInt(br.readLine());
            num=deleteAtSpecific(num,index);
            System.out.println("After deleting the specific position of element array is: "+Arrays.toString(num));
        }
    }
}
