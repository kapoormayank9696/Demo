
import java.io.File;

public class Deletefile {
    public static void main(String[] args) {
        File deletefile=new File("pokemon.txt");
        if(deletefile.delete()){
            System.out.println("Successfully File Delete");
        }
        else{
            System.out.println("Failed for deleting the file");
        }
    }
}
