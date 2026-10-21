// Find Target Indices After Sorting Array Algorithm Implementation In Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_IndicesAfterSortingArray {
    
    // Function Of Find Target Indices After Sorting Array
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }    

    // Main function
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;

        System.out.print("Print Orignal Array : ");
        System.out.print("[");
        for(int i=0;i<nums.length;i++) {
            if(i >0) System.out.print(",");
            System.out.print(nums[i]);
        }
        System.out.println("]");

        List<Integer> result = targetIndices(nums, target);
        System.out.print("Sorted Array: ");
        System.out.print("[");
        for(int i=0;i<nums.length;i++) {
            if(i >0) System.out.print(",");
            System.out.print(nums[i]);
        }
        System.out.println("]");

        System.out.print("Target Indices Array: ");
        System.out.print("[");
        for (int i=0; i < result.size(); i++) {
            if(i > 0) System.out.print(",");
            System.out.print(result.get(i));
        }
        System.out.println("]");
    }
}
