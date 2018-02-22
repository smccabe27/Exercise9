package day;

public class Day {
    
    private int dayValue = 1;
    private String day = "Sunday";
    
    public Day(){
        
    }
    public Day(int d){
        dayValue = d;
        day = findDay(d);
    }
    
    public static String findDay(int d){
        switch(d){
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wenesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Sunday";
        }
    }
    //Get the day
    public String getDay(){
        return day;
    }
    //Print the day
    public void printDay(){
        System.out.println(day);
    }
    //Set the day
    public void setDay(int d){
        dayValue = d;
        day = findDay(d);
    }
    //Add to the day
    public void addDay(int d){
        if(d>7){
            d %= 7;
        }
        dayValue += d;
        
        if(dayValue>7){
            dayValue -= 7;
        }
        day = findDay(dayValue);
    }
    //subract from the day
    public void subtractDay(int d){
        if(d>7){
            d %= 7;
        }
        dayValue -= d;
        
        if(dayValue<1){
            dayValue += 7;
        }
        day = findDay(dayValue);
    }
    //get next day
    public String getTomorrow(){
        if(dayValue == 7){
            return "Sunday";
        }
        else{
            return findDay(dayValue+1);
        }
    }
    //get previous day
    public String getYesterday(){
        if(dayValue == 1){
            return "Saturday";
        }
        else{
            return findDay(dayValue-1);
        }
    }
}