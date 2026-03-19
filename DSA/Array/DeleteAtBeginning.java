// Delete Element From Beginning Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class DeleteAtBeginning {
    // Function to delete the first element from an array
    public static int[] deleteAtBeginning(int[] num){
        if(num.length <= 1){
            return new int[0];
        }
        int[] nums=new int[num.length-1];
        for(int i=1;i<num.length;i++) {
            nums[i-1]=num[i];
        }
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
            num=deleteAtBeginning(num);
            System.out.println("After deleting the first element array is: "+Arrays.toString(num));
        }
    }
}

