public class nine {
    public static int sumOfRoundedValues(int a,int b,int c){
        if(a<=0||b<=0||c<=0){
            return -1;
        }
        else{
            if(a%10<5){
                a=(a/10)*10;
            }
            else{
                a=((a/10)+1)*10;
            }
          
            if(b%10<5){
                b=(b/10)*10;
            }
            else{
                b=((b/10)+1)*10;
            }
           
            if(c%10<5){
                c=(c/10)*10;
            }
            else{
                c=((c/10)+1)*10;
            }
            return a+b+c;
        }
    
        }
           public static void main(String[] args) {
        System.out.println(sumOfRoundedValues(22, 0, 55));
        
    }
    
}
