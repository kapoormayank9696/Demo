// Update the first element Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpdateAtBeginning {
    // Function to update the first element
    public static int[] updateAtBeginning(int[] num,int value){
        if(num.length == 0){
            return new int[0];
        }
        num[0]=value;
        return num;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            int[] num=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display an array: "+Arrays.toString(num));
            System.out.print("Enter value for updating: ");
            int value=Integer.parseInt(br.readLine());
            num=updateAtBeginning(num, value);
            System.out.println("After updating the first element array: "+Arrays.toString(num));
        }
    }
}
