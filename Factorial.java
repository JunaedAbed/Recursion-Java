public class Factorial{
    
    public static void main(String [] args){
        
        System.out.println(Fact(3));
        
        
    }
    public static int Fact(int n){
        if(n == 0) return 1;
        
        else{
            return n * Fact(n - 1);
        }
    }
    
    
    
    
}
