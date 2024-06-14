public class two {
    public static int getGreaterest(int num1,int num2){
        int temp=0;
      if(num1<0&&num2<0){
        return -1;
      }
      if(num1==0&&num2==0){
        return -2;
      }
      temp=num1>num2?num1:num2;
      return temp;
      
    }
    public static void main(String[] args) {
        System.out.println(getGreaterest(0,0));
        
    }
}
