// Currency Formatter Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Formatter {

    // Main function
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the payment: ");
            double payment=Double.parseDouble(br.readLine());
            NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
            NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String us=usFormat.format(payment);
            String india=indiaFormat.format(payment);
            String china=chinaFormat.format(payment);
            String france=franceFormat.format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
