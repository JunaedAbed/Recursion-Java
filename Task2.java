//Insertion Sort using recursion method

public class Task2 {  
    public static void main(String args[])  {  
        int array[] = {1,16,9,0,13,2};  
          
        insertSort(array, 1, array.length);  
        printArray(array);  
    } 
    
    public static void insertSort(int a[],int start,int size)  {  
        if(start == size)
            return; 
        else{ 
            int c = a[start];  
            int j = start - 1;  
            
            while (j >= 0 && a[j] > c) {  
                a[j + 1] = a[j];  
                j = j - 1;  
            }  
            a[j + 1] = c;  
        } 
        insertSort(a,start+1,size); 
    }  
    
    public static void printArray(int a[]){   
        for (int i = 0; i < a.length; i++){  
            System.out.print(a[i] + " ");    
        }
        System.out.println();  
    }
}
