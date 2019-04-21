//selection sort in linkedList

class Task4 { 
    static Node head;
    static Node tail;//tail is going to change
    
    public static void main(String args[]) {  
        int array[] = {19,76,45,23,89};  
        singlyList(array);
        print(head);
    } 
    
    static void singlyList(int []a){  
 
        for(int i=0;i<a.length;i++){ 
            if(i==0){ 
                Node node=new Node(a[i],null);  
                head=node; 
                tail=node; 
            } 
            else{ 
                Node node=new Node(a[i],null); 
                tail.next=node; 
                tail=tail.next; 
            } 
        } 
        selectionSort(head); 
    } 
    static void selectionSort(Node h){ 
        
        if(h == null) 
            return; 
        for(Node n = h; n != null; n = n.next){ 
            
            for(Node tail = n.next; tail != null; tail = tail.next){ 
                if(tail.elem < n.elem){ 
                    int temp = tail.elem; 
                    tail.elem = n.elem; 
                    n.elem = temp; 
                    
                } 
                
            } 
            
        }  
    }
    
    static void print(Node h){
        for(Node n = h;n!=null;n=n.next){ 
            System.out.print(n.elem+" ");
        }
        System.out.println();
    } 
} 
 
