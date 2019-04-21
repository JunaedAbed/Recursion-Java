/*Binary Search using Recursion

public class Task6{ 
    public static void main (String []args){ 
        int a[]={0,4,8,9,13,15,20,23,35}; 
        
        
        if(binarySearch(a, 13, 0, a.length-1)) 
            System.out.println(" Number Found "); 
        else{ 
            System.out.println(" Number Not Found "); 
        }
    } 
    
    public static boolean binarySearch(int arr[], int elem, int start, int end) { 
        if(start>end) 
            return false; 
        int mid=(start+end)/2; 
        if(arr[mid]==elem){ 
            return true; 
        } 
        if(arr[mid]<elem){ 
            return binarySearch(arr,elem,mid+1,end); 
        } 
        else{ 
            
            return binarySearch(arr,elem,start,mid-1); 
        } 
        
        
    } 
}
