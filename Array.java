public class Array{
    public static void main(String [] args){
        int [] a = {0,1,2,3,4,5,6,7};
        System.out.println("Printing array");
        PrintArray(a, a.length-1);
    }
    
    public static void PrintArray(int [] a, int size){
//       
       
        
        if(size != -1){
            PrintArray(a, size-1);
            System.out.print(a[size]+" ");
            //PrintArray(a, size-1);
        }
    }
}