// Majority Element From an Array Algorithm Implement in a Java

public class MajorityElements {

    // Function to find the majority element
    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}
