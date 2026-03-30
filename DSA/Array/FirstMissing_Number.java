// Find the Missing Number In An Array Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FirstMissing_Number {
    // Function to find the first missing number in the array
    public static int findMissingNumber(int[] nums, int n) {
        // Place each number in its correct position
        for(int i=0;i<n;i++) {
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // Step 2: Find first missing positive
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }
        // Step 3: If all positions correct
        return n + 1;
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the size of the array: ");
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            int missingNumber = findMissingNumber(arr, n);
            System.out.println("The first missing number is: " + missingNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

