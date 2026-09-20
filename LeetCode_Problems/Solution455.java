public class Solution455 {
    
    public static class Solution {
        public void quickSort(int[] nums,int low,int high) {
            if(low< high) {
                int pi = partition(nums,low,high);
                quickSort(nums,low,pi-1);
                quickSort(nums,pi+1,high);
            }
        }

        public int partition(int[] nums,int low,int high) {
            int pivot = nums[high];
            int i = low - 1;

            for(int j = low; j < high; j++) {
                if(nums[j] < pivot) {
                    i++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            i++;
            int temp = nums[i];
            nums[i] = nums[high];
            nums[high] = temp;
            return i;
        }
        
        public int findContentChildren(int[] g, int[] s) {
            quickSort(g,0,g.length-1);
            quickSort(s,0,s.length-1);
            
            int child = 0;
            int cookies = 0;
            
            while(child < g.length && cookies < s.length) {
                if(s[cookies] >= g[child]) {
                    child++;
                }
                cookies++;
            }

            return child;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int result = solution.findContentChildren(g, s);
        System.out.println("Number of content children: " + result);
    }
}