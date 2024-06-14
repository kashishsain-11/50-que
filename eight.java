public class eight {
    public static int sumOfMultiples(int num1,int num2,int num3){
        if(num1%10==0){
           num1=num1;
        }
        else{
         num1=((num1/10)+1)*10;
        }


        if(num2%10==0){
            num2=num2;
        }
        else{
         num2=((num2/10)+1)*10;
        }  
        
        if(num3%10==0){
           num3=num3;
        }
        else{
         num3=((num3/10)+1)*10;
        }

        return num1+num2+num3;
    }
    public static void main(String[] args) {
       System.out.println(sumOfMultiples(30, 40, 70));
        
    }
    
}
