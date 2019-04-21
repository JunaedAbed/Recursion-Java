public class NonDummy{
    static Node head;
    
    public static void main(String [] args ){
        int [] a = {3,4,5,6,7,8};
        
        System.out.println(Add(LinkedList(a)));
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
    
    public static int Add(Node h){
        int sum;
        if(h.next == null){
            return h.elem;
        }
        else{
            sum =(Add(h.next) + h.elem);
            return sum;
        }

    }
}