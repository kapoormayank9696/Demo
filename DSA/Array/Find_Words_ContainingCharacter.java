// Find Words Containing Character Algorithm Implementation In Java
import java.util.ArrayList;
import java.util.List;

public class Find_Words_ContainingCharacter {

    // Function of find Word Containing from string array
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            for(int j=0 ;j<words[i].length();j++) {
                if(words[i].charAt(j)==x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.print("Print String Array: [");
        for(int i=0;i<words.length;i++) {
            if(i > 0) System.out.print(",");
            System.out.print(words[i]);
        }

        System.out.print("]\n");
 
        List<Integer> list = findWordsContaining(words, x);
        System.out.print("Print where target is found: [");
        for(int i=0;i<list.size();i++) {
            if(i > 0) System.out.print(",");
            System.out.print(list.get(i));
        }
        System.out.print("]\n");
    }
}
