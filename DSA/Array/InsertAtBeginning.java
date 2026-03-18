// Insert the element at beginning Algorithm Implmentation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class InsertAtBeginning {
    // Function to insert the element at Beginning
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static int[] insertAtBeginning(int value,int[] num){
        int[] nums=new int[num.length+1];
        // insert at beginning
        nums[0]=value;
        for(int i=0;i<num.length;i++) {
            nums[i+1]=num[i]; // Shift right side
        }
        return nums;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of matrix: ");
            int n=Integer.parseInt(br.readLine());
            int[] num=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display the array: "+Arrays.toString(num));
            System.out.print("Enter elements for insert at beginning: ");
            int value=Integer.parseInt(br.readLine());
            num=insertAtBeginning(value, num);
            System.out.println("After inserting element array: "+Arrays.toString(num));
        }
    }
}

