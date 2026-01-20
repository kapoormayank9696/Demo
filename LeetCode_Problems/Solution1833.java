// LeetCode Problem 1833: Maximum Ice Cream Bars
import java.util.Scanner;
public class Solution1833{

    // Function to find the maximum number of ice cream bars that can be bought
    public static int maxIceCream(int[] costs, int coins) {
        int max=costs[0];
        int min=costs[0];
        for(int num: costs){
            if(num > max){
                max=num;
            }
            if(num < min){
                min=num;
            }
        }
        int[] count=new int[max-min+1];
        for(int num: costs){
            count[num-min]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                costs[k++]=i+min;
                count[i]--;
            }
        }
        int total=0;
        int sum=0;
        for(int num:costs){
            if(sum+num > coins)
                break;
            sum=sum+num;
            total++;
        }
        return total;
    }

    // Function to print the array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of ice cream bars: ");
        int n=sc.nextInt();
        int[] costs=new int[n];
        System.out.print("Enter costs of ice cream bars: ");
        for(int i=0;i<n;i++){
            costs[i]=sc.nextInt();
        }
        System.out.print("Enter coins: ");
        int coin=sc.nextInt();
        System.out.print("Print costs of ice cream bars: ");
        printArray(costs);
        int result=maxIceCream(costs,coin);
        System.out.println("Maximum Ice Cream Bars that can be bought: " + result);
    }
}

