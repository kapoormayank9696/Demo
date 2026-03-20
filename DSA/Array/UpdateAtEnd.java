// Update the last element value Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class UpdateAtEnd {
    // Function to update the last element
    public static int[] updateAtEnd(int[] num,int value){
        if(num.length == 0){
            return new int[0];
        }
        num[num.length-1]=value;
        return num;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter elements: ");
            int[] num=new int[n];
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display an array: "+Arrays.toString(num));
            System.out.print("Enter element for updating: ");
            int value=Integer.parseInt(br.readLine());
            num=updateAtEnd(num, value);
            System.out.println("After updating an array: "+Arrays.toString(num));
        }
    }    
}
