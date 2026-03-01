// Target Element Index Find From List Algorithms Implementation In Java

// IntStream.range(0, numsCount) → creates a stream of integers from 0 to numsCount - 1.
// mapToObj(i -> { ... }) → for each i, read a line from input using bufferedReader.readLine().
// .replaceAll("\\s+$", "") → removes trailing whitespace from the line.
// .map(String::trim) → removes any leading/trailing spaces.
// .map(Integer::parseInt) → converts each line into an integer.
// .collect(toList()) → collects all integers into a List<Integer>.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class TargetIndex {

    // Class to find the target element index from the list
    public static class Solution {
        public static int binarySearch(List<Integer> nums, int target) {
            for(int i=0;i<nums.size();i++) {
                if(target == nums.get(i)) {
                    return i;
                }
            }
            return -1;
        }
    }

    // Main function
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of terms in list: ");
        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.print("Enter elements: ");
        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());
        System.out.print("Enter target element: ");
        int target = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Solution.binarySearch(nums, target);
        System.out.println("Target element index at: "+result);
        bufferedReader.close();
    }
}
