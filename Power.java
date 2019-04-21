public class Power{
    public static void main(String [] args){
        System.out.println(Print(3,2));
    }
    
    public static int Print(int m, int n){
        if(n == 1) return m;
        
        else{
            return Print(m, n - 1) * m;
        }
    
    } 
}