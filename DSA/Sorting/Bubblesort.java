// Bubble sort in Java programming Language

public class Bubblesort {

    // Method to perform the bubble sort algorithms
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }
    
    // Method to print an array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr={64,34,25,12,22,11,90};
        System.out.println("Before Sorting an array");
        printArray(arr);
        System.out.println("After Sorting an array using bubble Sort");
        bubbleSort(arr);
        printArray(arr);
    }
}

