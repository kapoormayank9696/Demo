// Insert the element at specific position Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertAtSpecific {
    // Function to insert the element at specific position
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static int[] insertAtSpecific(int[] num,int index,int values) {
        if(index < 0 || index > num.length){
            System.out.println("Invalid index for inserting!!!!");
            return num;
        }
        int[] nums=new int[num.length+1];
        // Copy elements before index
        for(int i=0;i<index;i++){
            nums[i]=num[i];
        }
        // Insert element
        nums[index]=values;
        // Shift remaining elements
        for (int i = index; i < num.length; i++) {
            nums[i + 1] = num[i];
        }
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
            System.out.print("Enter index for inserting the element: ");
            int index=Integer.parseInt(br.readLine());
            System.out.print("Enter element insert at specific position: ");
            int values=Integer.parseInt(br.readLine());
            arr=insertAtSpecific(arr,index,values);
            System.out.println("Display array after inserting element at specific position: "+Arrays.toString(arr));
        }
    }
}
