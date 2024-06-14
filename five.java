public class five {
    public static int findSign(int num){
        if(num>0){
            return 1;

        }
        if(num<0){
            return -1;
        }
      return 0;
    }
    public static void main(String[] args) {
      System.out.println(  findSign(-10));
    }
    
}
