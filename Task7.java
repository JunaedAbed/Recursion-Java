public class Task7{
    static int[] f = new int[6];
    public static void main(String [] args){
        System.out.println(fibo(3));
    }
    
    public static int fibo(int x){
        if(x == 1 || x == 0) return x;
        
        else{
            if(f[x] == 0)
                f[x] = fibo(x-1)+fibo(x-2);
            return f[x];
        }
    }
}