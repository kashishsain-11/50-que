public class eleven {
    public static boolean countBoolean(boolean num1,boolean num2,boolean num3){
        int trueCount = 0;
        
        if (num1){
            trueCount++;
        }
        
        if (num2){
            trueCount++;
        }
        if (num3) {
            trueCount++;
        }
        
        return trueCount >= 2;

    }
    public static void main(String[] args) {
        System.out.println(countBoolean(true, true, false));
    }
    
}
