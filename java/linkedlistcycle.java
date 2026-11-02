
public class linkedlistcycle {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void solve(Node head) {

        Node slow = head;
        Node fast = head;

  
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            System.out.println("No cycle");
            return;
        }

       
        slow = head;

        if (slow == fast) {

         
            while (fast.next != slow) {
                fast = fast.next;
            }

        } else {

            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

     
        fast.next = null;

        System.out.println("Cycle detected and removed");
    }

    public void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        linkedlistcycle obj = new linkedlistcycle();

    
        Node head = obj.new Node(1);
        head.next = obj.new Node(2);
        head.next.next = obj.new Node(3);
        head.next.next.next = obj.new Node(4);
        head.next.next.next.next = obj.new Node(5);

   
        head.next.next.next.next.next = head.next.next;


        obj.solve(head);

    
        obj.printList(head);
    }
}
