public class Binary{
    public static void main(String []  args){
        System.out.println(DeicmalToBinary(10));
    }
    
    public static String DeicmalToBinary(int x){
      int s;
      if(x > 0){
          s = x % 2;
          return (DeicmalToBinary(x / 2)+""+s);
      } 
        
        
        return ""; 
    }
}