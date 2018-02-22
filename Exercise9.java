import day.Day;
import java.util.Scanner;

public class Exercise9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Day day = new Day();
        
        while(true){
            System.out.println("Enter integer value 1-7 corresponding to the day");
            day.setDay(scan.nextInt());
            System.out.println("Today is " + day.getDay());
            System.out.println("Tommorrow is " + day.getTomorrow());
            System.out.println("Yesterday was " + day.getYesterday());
            day.addDay(15);
            System.out.println("Fifteen days from now is a " + day.getDay());
            day.subtractDay(30);
            System.out.println("Fifteen days ago was a " + day.getDay());
        }
    }
}