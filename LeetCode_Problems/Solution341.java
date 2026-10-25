// LeetCode Problem 341 : Flatten Nested List Iterator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution341 {

    // NestedInteger class for local testing
    public static class NestedInteger {
        public boolean isInt;
        public int value;
        public List<NestedInteger> nestedList;

        // Constructor for an integer
        public NestedInteger(int val) {
            isInt = true;
            value = val;
            nestedList = new ArrayList<>();
        }

        // Constructor for a nested list
        public NestedInteger(List<NestedInteger> list) {
            isInt = false;
            nestedList = list;
        }

        // Check It is Integer Or Not
        public boolean isInteger() {
            return isInt;
        }

        // Get Integer Value
        public Integer getInteger() {
            if (isInt) {
                return value;
            }
            return null;
        }

        // Get List Into List Form
        public List<NestedInteger> getList() {
            if (isInt) {
                return new ArrayList<>();
            }
            return nestedList;
        }
    }

    // Class Nested Iterator
    public static class NestedIterator implements Iterator<Integer> {
    
        Stack<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();

            for (int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        // Next Operation
        public Integer next() {
            if(hasNext()) {
                return stack.pop().getInteger();
            }
            return null;
        }
        
        @Override
        // Has Next Operation
        public boolean hasNext() {
            while(!stack.isEmpty()) {
                NestedInteger current = stack.peek();

                if(current.isInteger()) {
                    return true;
                }
                stack.pop();

                List<NestedInteger> list = current.getList();   
                for (int i = list.size() - 1; i >= 0; i--) {
                    stack.push(list.get(i));
                }
            }

            return false;
        }
    }
    
    // Main function
    public static void main(String[] args) {
        // Input: [[1,1], 2, [1,1]]
        List<NestedInteger> nestedList = new ArrayList<>();

        nestedList.add(
            new NestedInteger(Arrays.asList(
                new NestedInteger(1),
                new NestedInteger(1)
            ))
        );

        nestedList.add(new NestedInteger(2));

        nestedList.add(
            new NestedInteger(Arrays.asList(
                new NestedInteger(1),
                new NestedInteger(1)
            ))
        );

        NestedIterator iterator = new NestedIterator(nestedList);

        System.out.print("Flattened List: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
    }
}
