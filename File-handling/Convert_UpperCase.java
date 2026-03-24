// Convert File Data Into Upper Case and Sort Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Convert_UpperCase {

    // Main function
    public static void main(String[] args) {
        // Creates File
        File file=new File("pokemon.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Successfully new files create..");
            }else {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Convert file data into upper letters
        try {
            List<String> lines=new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line.toUpperCase());
                }
            }
            // 🔹 Sort lines
            Collections.sort(lines);
            // 🔴 WRITE BACK TO FILE (Missing in your code)
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String l : lines) {
                    writer.write(l);
                    writer.newLine();
                }
            }
            System.out.println("File updated to uppercase and sorted successfully.");
            // Display result
            System.out.println("\nSorted Content:");
            for (String l : lines) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
