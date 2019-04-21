public class Fibonacci{
    static int [] f = new int[6];
    public static void main(String [] args){
        System.out.println(Fibo(3));//0 1 1 2 3 5.....
        
        System.out.println(factWtMemoization(3));/*returns the factorial number
                                               of the index using memoization */
    }
    
    public static int Fibo(int n){
        if(n == 0) return 0;
        
        else if(n ==1) return 1;
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    
    public static int factWtMemoization(int n){
        if(n == 1 || n == 0) return n;
        else{
            if(f[n] == 0)
                f[n] = factWtMemoization(n - 1)+ factWtMemoization(n - 2); /*sending the larger 
                                                                 *one first to fillup the f array 
                                                                 *as much as possible so that
                                                                 *it can be used to do the
                                                                 *smaller ones.*/
            return f[n];
        }
    }
}