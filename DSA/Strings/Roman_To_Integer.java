// Roman to Integer Algorithm Implementation In Java
public class Roman_To_Integer {
        
    // Function to convert the roman number to integer number
    public static int romanToInt(String s) {
        int ans = 0,prev = 0,num = 0;
        for(int i=s.length()-1 ;i >= 0;i --) {
            switch (s.charAt(i)) {
                case 'M' -> num = 1000;                  
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            if(num < prev) {
                ans -= num;
            } else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        String s  = "LVIII";
        System.out.println("Roman number to integer: "+romanToInt(s));
    }
}
