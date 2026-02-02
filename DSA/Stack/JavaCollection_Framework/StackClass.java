// Stack Implementation In Java By Using Java Collection Framework

import java.util.*;
public class StackClass{
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        // Stack Interface works with the stack class
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter element: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            stack.push(value);
        }
        System.out.println("Dispaly the stack data: "+stack.toString());
        System.out.println("Top stack element: "+stack.peek());
        System.out.println("Popped stack element: "+stack.pop());
        System.out.println("New top stack element: "+stack.peek());
        sc.close();
    }
}
