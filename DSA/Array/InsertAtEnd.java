// Insert the element at end Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertAtEnd {
    // Function to insert the element at end
    public static int[] insertAtEnd(int[] num,int values) {
        int[] nums=new int[num.length+1];
        int i;
        for(i=0;i<num.length;i++){
            nums[i]=num[i];
        }
        nums[i]=values;
        return nums;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of array: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter elements: ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display the array: "+Arrays.toString(arr));
            System.out.print("Enter element insert at end: ");
            int values=Integer.parseInt(br.readLine());
            arr=insertAtEnd(arr,values);
            System.out.println("Display array after inserting element at end: "+Arrays.toString(arr));
        }
    }
}
