public class ten {
    public static String ringAlarm(int day,boolean onVacation){
        if(day<0||day>6){
            return "invalid input";
        }
        if (day >= 1 && day <= 5) {  // Weekdays
            if (onVacation) {
                return "10:00";
            } else {
                return "07:00";
            }
        }
        else {  
            if (onVacation) {
                return "OFF";
            } else {
                return "10:00";
            }
        }
    }


    
    public static void main(String[] args) {
        System.out.println(ringAlarm(4, true));
        
    }
    
}
