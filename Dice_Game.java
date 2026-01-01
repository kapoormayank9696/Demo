public class Dies_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Die's Game!");
        int target = 6;
        int count = 0;
        int rollnumber;
        do { 
            rollnumber = (int)(Math.random()*6)+1;
            System.out.println("Roll "+count+": You rolled a "+rollnumber);
            count++;
        } while (rollnumber != target);
        System.out.println("Congratulations! you rolled a "+target+"in "+count+" rolls.");
    }
}
