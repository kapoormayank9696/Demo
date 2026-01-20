// LeetCode Problem 2037: Minimum Number of Moves to Seat Everyone

import java.util.Scanner;
public class Solution2037 {

    // Method to calculate minimum moves
    public static int minMovesToSeat(int[] seats, int[] students) {
        int max=seats[0];
        int min=seats[0];
        for(int num: seats){
            if(num > max){
                max=num;
            }
            if(num < min){
                min=num;
            }
        }
        int[] count=new int[max-min+1];
        for(int num: seats){
            count[num-min]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                seats[k++]=i+min;
                count[i]--;
            }
        }
        int maxVal=students[0];
        int minVal=students[0];
        for(int num: students){
            if(num > maxVal){
                maxVal=num;
            }
            if(num < minVal){
                minVal=num;
            }
        }
        int[] count1=new int[maxVal-minVal+1];
        for(int num: students){
            count1[num-minVal]++;
        }
        int l=0;
        for(int i=0;i<count1.length;i++){
            while(count1[i] > 0){
                students[l++]=i+minVal;
                count1[i]--;
            }
        }
        int distance,sum=0;
        for(int j=0;j<seats.length;j++){
            if(seats[j] >= students[j]){
                distance=seats[j]-students[j];
                sum=sum+distance;
            }else{
                distance=students[j]-seats[j];
                sum=sum+distance;
            }
        }
        return sum;
    }

    // Function to print array
    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of seats: ");
        int n=sc.nextInt();
        int[] seats=new int[n];
        System.out.print("Enter the positions of seats: ");
        for(int i=0;i<n;i++){
            seats[i]=sc.nextInt();
        }
        System.out.print("Enter the positions of students: ");
        int[] students=new int[n];
        for(int i=0;i<n;i++){
            students[i]=sc.nextInt();
        }
        System.out.print("Seats positions: ");
        printArray(seats);
        System.out.print("Students positions: ");
        printArray(students);
        int result=minMovesToSeat(seats, students);
        System.out.println("Minimum number of moves to seat everyone: " + result);
        sc.close();
    }
}
