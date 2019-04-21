public class NonDummyReverse{
    static Node head;
    
    public static void main(String [] args ){
        int [] a = {6,5,4,3,2,1};
        
        Print(LinkedList(a));
    }
    
    public static Node LinkedList(int [] a){
        Node n = new Node(a[0], null);
        head = n;
        Node tail = n;
        
        for(int i = 1; i < a.length; i++){
            Node node = new Node(a[i], null);
            tail.next = node;
            tail = tail.next;
        }
        return n;
    }
    
    public static void Print(Node h){
 
        if(h.next == null){
            System.out.println(h.elem);
        }
        else{
            Print(h.next);
            System.out.println(h.elem);
        }

    }
}