public class thrteen {
    public static String getNumberse(int start, int end) {
        if (start < 0 || end < 0) {
            return "-1";
        }
        
        if (start == end) {
            return "-2";
        }
    
        if (start > end) {
            return "-3";
        }
     
        if (end - start <= 1) {
            return ""; 
        }
        
        return getHelper(start + 1, end - 1);
    }
    private static String getHelper(int start, int end) {
       
        if (start == end) {
            return Integer.toString(start);
        }
        return start + " " + getHelper(start + 1, end);
    }



    public static void main(String[] args) {
        System.out.println(getNumberse(1, 10));
        
    }
}
