public class mergetwolinkedlist{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node solve(Node h1,Node h2){
        if(h1==null) return h2;
        if(h2==null) return h1;
        if(h1.data<h2.data){
            h1.next=solve(h1.next,h2);
            return h1;
        }
        else{
            h2.next=solve(h1,h2.next);
            return h2;
        }
    }
    public static void main(String [] args){
      mergetwolinkedlist obj = new mergetwolinkedlist();


        Node h1 = obj.new Node(1);
        h1.next = obj.new Node(3);
        h1.next.next = obj.new Node(5);

        
        Node h2 = obj.new Node(2);
        h2.next = obj.new Node(4);
        h2.next.next = obj.new Node(6);


        Node result = obj.solve(h1, h2);

   
        while (result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }

        System.out.println("null");
    }
}