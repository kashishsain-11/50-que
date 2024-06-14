public class six {
   public static void isEvenOdd(int num){
    if(num<=0){
        System.out.println("Invali Input");
    }
    else{
    if(num%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
   }
    public static void main(String[] args) {
        isEvenOdd(0);
        
    }
    
}
