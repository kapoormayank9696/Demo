import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class carbooking {
    public static void main(String[] args) {
        System.out.println("Welocme to my car rent showroom");
        Scanner c = new Scanner(System.in);
        System.out.print("Car Rent/Check Car Booking/Cancel Car Booking : ");
        String file = c.nextLine();
        if("Car Rent".equals(file) || "CAR RENT".equals(file) || "car rent".equals(file) || "Car rent".equals(file)){
            System.out.print("Do you want take a car on the rent : ");
            Scanner n = new Scanner(System.in);
            String str = n.next();
            while("Yes".equals(str) || "yes".equals(str) || "YES".equals(str))
            {
                try {
                    File car = new File("CarRentBooking.txt");
                    if(car.createNewFile()){}
                } catch (IOException e) {
                    System.out.println("Error");
                }
                System.out.println("Welcome to my car rent showroom");
                System.out.println("I have five car of the different modals for the rent with full details : \n");
                System.out.println("(1). Car-id = 123\t\t\t\t\t\tModel = Maruti Dzire\t\t\t\t\tCar-name = 2020 Maruti Suzuki DZire VXi AMT\nEngine = 1197 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\tEngine Type = K-Series Petrol engine with VVT\nTurbocharger / Supercharger = No\t\t\t\tFuel Type = Petrol\nMax Power (bhp@rpm) = 82 bhp @ 6000 rpm\t\t\t\tMax Torque (Nm@rpm) = 113 Nm @ 4200 rpm\nEmission Standard = BS 6\t\t\t\t\tMileage (ARAI) = 21.21 kmpl\nIdle Start/Stop = 0\t\t\t\t\t\tDrivetrain = FWD\nTransmission = Manual-5 Gears\n");
                System.out.println("(2). Car-id = 134\t\tModel = Honda CR-V\t\tCar-name = 2019 Honda CR-V 2.0\nEngine = 1597 cc - 2354 cc\tPower = 118.3 - 187.4 bhp\nTorque = 350 Nm - 300 Nm\tSeating Capacity = 7\nDrive Type = FWD /4WD\t        Mileage = 12 - 19.5 kmpl\n");
                System.out.println("(3). Car-id = 203\t\t\tModel = Toyota Camry\t\t\tCar-name = 2016 Toyota Camry Hybrid\nEngine = 2487 cc\t\t\tFuel Type = Hybrid (Electric + Petrol)\nTransmission = Automatic (e-CVT)\tMileage (ARAI) = 25.49 kmpl\nPower = 184 bhp\ttorque = 221 Nm\n");
                System.out.println("(4). Car-id = 145\t\t\t\t\t\tModel = Hyundai Aura\t\t\tCar-name = 2022 Hyundai Aura S 1.2 Petrol\nEngine = 1197 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\tEngine Type = 1.2 Kappa Petrol\nTurbocharger / Supercharger = No\t                        Fuel Type = Petrol\nMax Power (bhp@rpm) = 82 bhp @ 6000 rpm\t\t\t\tMax Torque (Nm@rpm) = 114 Nm @ 4000 rpm\nAlternate Fuel = Not Applicable\t\t\t\t\tEmission Standard BS 6\nMileage (ARAI) = 21 kmpl Mileage - Owner Reported = 19 kmpl\tIdle Start/Stop = 0\nDriving Range = 777 km\t\t\t\t\t\tDrivetrain = FWD\nTransmission = Manual - 5 Gears\t\t\t\t\tRegenerative Braking = 0\nPure Electric Driving Mode = 0\n");
                System.out.println("(5). Car-id = 590\tModel Toyota Corolla\tCar-name = 2013 Toyota Corolla Fz\nFuel Type = Petrol\tTransmission = Manual\n");
                System.out.print("Which car do you like for the rent : ");
                Scanner choices = new Scanner(System.in);
                String str1 = choices.nextLine();
                if("2020 Maruti Suzuki DZire VXi AMT".equals(str1) || "1".equals(str1)){
                    str1 = "2020 Maruti Suzuki DZire VXi AMT";
                    System.out.println("Per day price is = ₹2,000 - ₹3,000");
                }
                else if("2019 Honda CR-V 2.0".equals(str1) || "2".equals(str1)){
                    str1 = "2019 Honda CR-V 2.0";
                    System.out.println("Per day price is = ₹2,000 - ₹3,500");
                }
                else if("2016 Toyota Camry Hybrid".equals(str1) || "3".equals(str1)){
                    str1= "2016 Toyota Camry Hybrid";
                    System.out.println("Per day price is = ₹3,500 - ₹4,000");
                }
                else if("5".equals(str1) || "2013 Toyota Corolla Fz".equals(str1))
                {
                    str1 = "2013 Toyota Corolla Fz";
                    System.out.println("Per day price is = ₹3,800 - ₹4,500");
                }
                else if("2022 Hyundai Aura S 1.2 Petrol".equals(str1) || "4".equals(str1)){
                    str1 = "2022 Hyundai Aura S 1.2 Petrol";
                    System.out.println("Per day price is =  ₹3,000 - ₹5,250");
                }
                System.out.println();
                System.out.print("Do you want carry more information : ");
                Scanner sc = new Scanner(System.in);
                String str2 = sc.next();
                if("YES".equals(str2) || "yes".equals(str2) || "Yes".equals(str2) || "ya".equals(str2) ){
                    System.out.print("How much time you will take the car for rent : ");
                    Scanner x = new Scanner(System.in);
                    byte n1 = x .nextByte();
                    if(n1 >= 5 && n1 < 10){
                        System.out.println("5% discount at the total price");
                    }
                    else if(n1 >= 10 && n1 <15){
                        System.out.println("12% discount at the total price");
                    }
                    else if(n1 >= 15 && n1 < 20){
                        System.out.println("15% discount at the total price");
                    }
                    else if(n1 >= 20 && n1 < 25){
                        System.out.println("18% discount at the total price");
                    }
                    else if(n1 >= 25 && n1 > 30){
                        System.out.println("20% discount at the total price");
                    }
                    else{
                        System.out.println("2% discount at the total price");
                    }
                    System.out.print("Do you want Confirm your booking : ");
                    Scanner s = new Scanner(System.in);
                    String str3 = s.nextLine();
                    if("Yes".equals(str3) || "yes".equals(str3) || "YES".equals(str3))
                    {
                        try{
                            FileWriter fileobj = new FileWriter("CarRentBooking.txt");
                            Scanner y = new Scanner(System.in);
                            System.out.print("Customer Id : ");
                            String l = y.nextLine();
                            fileobj.write("Customer Id : "+l+"\n");
                            String w = str1;
                            System.out.println("Car Name : "+w);
                            fileobj.write("Car Name : "+w+"\n");
                            System.out.print("Enter your name please : ");
                            String p = y.nextLine();
                            fileobj.write("Name : "+p+"\n");
                            System.out.print("Phone number : ");
                            Long q = y.nextLong();
                            fileobj.write("Phone number : "+q+"\n");
                            System.out.print("Driving license number : ");
                            String r = y.next();
                            fileobj.write("Driving License number : "+r+"\n");
                            System.out.print("Payment Mode : ");
                            String u = y.next();
                            fileobj.write("Payment mode : "+u+"\n");
                            System.out.print("Timing : ");
                            String v = y.nextLine();
                            String g = y.nextLine();
                            fileobj.write("Timing of car reciving : "+g+"\n");
                            System.out.print("Enter Pickup Date of car : ");
                            String k = y.nextLine();
                            fileobj.write("Pickup Date of car is : "+k+"\n");
                            System.out.print("Return Date of car : ");
                            String m = y.nextLine();
                            fileobj.write("Return Date of car is : "+m+"\n");
                            System.out.print("Return timing : ");
                            String j = y.nextLine();
                            fileobj.write("Return timing : "+j+"\n");
                            System.out.println("Pay 20% Payment for booking your car");
                            System.out.println("Confirm your booking");
                            fileobj.write("YOUR BOOKING IS CONFIRM AND TIMELY REICIVE THE CAR");
                            fileobj.close();
                        }catch(IOException e){
                            System.out.println("Error");
                        }
                        System.out.println("Thanks for visiting my showroom");
                    }
                    else if("No".equals(str3) || "no".equals(str3) || "NO".equals(str3)){
                        System.out.println("Thanks for visiting my showroom");
                        break;
                    }
                }
                while("NO".equals(str2) || "no".equals(str2) || "No".equals(str2)){
                    System.out.println("Thanks for visiting my showroom");
                    break;
                }
                break;
            }
        }
        else{
            System.out.println("You cannot book any car for the rent");
        }
        while("Check car booking".equals(file) || "CHECK CAR BOOKING".equals(file) || "check car booking".equals(file))
        {
            try {
                File readfile = new File("CarRentBooking.txt");
                Scanner read = new Scanner(readfile);
                while(read.hasNextLine()){
                    String line = read.nextLine();
                    System.out.println(line);
                }
            }catch (FileNotFoundException e) {
                System.out.println("File cannot found");
            }
            break;
        }
        while("CANCEL CAR BOOKING".equals(file) || "cancel car booking".equals(file) || "Cancel Car Booking".equals(file)){
            File fileobj = new File("CarRentBooking.txt");
            if(fileobj.exists())
            {
                if(fileobj.delete()){
                System.out.println("Sucessfully cancelling");
                }
            }
            else{
                System.out.println("Your booking are not confirm this reason failed the cancelling");
            }
            break;
        }
    }
}

