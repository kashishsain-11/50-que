public class four {
   public static int oddRounder(int num){
    if(num<0){
        return -1;
    }
    if(num==0){
        return -2;
    }
    if(num%2==0){
        return num;
    }
    return((num/10)+1)*10;
}
    public static void main(String[] args) {
        System.out.println(oddRounder(31));
        
    }
    
}
