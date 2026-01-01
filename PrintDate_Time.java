// Java Demonstrtae The Date Print
public class PrintDate_Time {
    public static void main(String[] args ){
        java.util.Date currentDate = new java.util.Date();
        System.out.println("Current Date and Time : "+currentDate.toString());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int dayofweek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        String dayName="";
        switch (dayofweek){
            case 1:
            dayName="Sunday";
            break;
            case 2:
            dayName="Monday";
            break;
            case 3:
            dayName="Tuesday";
            break;
            case 4:
            dayName="Wednesday";
            break;
            case 5:
            dayName="Thursday";
            break;
            case 6:
            dayName="Friday";
            break;
            case 7:
            dayName="Saturday";
            break;
        }
        if(dayName == "Saturday" || dayName == "Sunday"){
            System.out.println("It's a holiday today! Enjoy your "+dayName);
        }
        else{
            System.out.println("Day of the week : "+dayName);
        }
    }
}
