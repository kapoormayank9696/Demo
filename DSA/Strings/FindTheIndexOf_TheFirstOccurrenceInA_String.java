// Find the Index of the First Occurrence in a String Algorithm Implementation In Java
public class FindTheIndexOf_TheFirstOccurrenceInA_String {
    
    // Function To Find Index of the First Occurence In a String
    public static int strStr(String haystack, String needle) {
        for(int i=0 ,j = needle.length(); j<=haystack.length(); i++, j++) {
            if(haystack.substring(i,j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    // Main function
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("Index Of first occurence in a string: "+strStr(haystack, needle));
    }
}
