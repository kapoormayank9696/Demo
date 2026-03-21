import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpdateAtSpecific {
    // Function to update the value
    public static int[] updateAtSpecific(int[] nums,int index,int value){
        if(nums.length == 0 || index < 0 || nums.length <= index){
            System.out.println("Invalid index!");
            return nums;
        }
        nums[index]=value;
        return nums;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter elements: ");
            int[] num=new int[n];
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display an array: "+Arrays.toString(num));
            System.out.print("Enter index for upating: ");
            int index=Integer.parseInt(br.readLine());
            System.out.print("Enter element for updating: ");
            int value=Integer.parseInt(br.readLine());
            num=updateAtSpecific(num,index, value);
            System.out.println("After updating an array: "+Arrays.toString(num)); 
        }     
    }    
}
