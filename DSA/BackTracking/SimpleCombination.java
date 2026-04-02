// Simple Combination using Backtracking Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SimpleCombination {
    // Function to generate combinations
     public static void generateCombination(List<List<Integer>> result,List<Integer> temp,int start,int n,int k) {
        if(temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++) {
            // Add
            temp.add(i);
            // Recursive Call
            generateCombination(result,temp,i+1,n,k);
            // Undo
            temp.remove(temp.size()-1);
        }
    }

    // Main function
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter number of times: ");
            int k=Integer.parseInt(br.readLine());
            System.out.println("You entered: " + n + " and " + k);
            List<List<Integer>> result=new ArrayList<>();
            generateCombination(result,new ArrayList<>(),1,n,k);
            System.out.println("Combinations:");
            for(List<Integer> num:result) {
                System.out.println(num);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
