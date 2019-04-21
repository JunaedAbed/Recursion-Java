/*Selection Sort using recursion*/

class Task1 { 
    public static void main(String args[]) {  
        int array[] = {9,1,5,3,6,7}; 
        
        selectionSort(array, array.length, 0); 
        printArray(array);
    }  
//finding minimum index    
    public static int minIndex(int a[], int i, int j) {  
        if (i == j)  
            return i;  
        int minIdx = minIndex(a, i + 1, j);  
        if (a[i] < a[minIdx]) 
            return i ; 
        return minIdx;  
    } 
    
    public static void selectionSort(int a[], int size, int idx) {  
        
        if (idx == size)  
            return ;  
        int min = minIndex(a, idx, size-1);  
        
        if (min != idx){  
            int temp = a[min];  
            a[min] = a[idx];  
            a[idx] = temp;  
        }  
        selectionSort(a, size, idx + 1);  
    }
    
    public static void printArray(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
} 
