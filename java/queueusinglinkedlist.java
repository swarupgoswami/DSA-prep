public class queueusinglinkedlist {

    public static class Queue {

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node front;
        Node rear;

   
        void push(int data) {

            Node newNode = new Node(data);

        
            if (rear == null) {
                front = rear = newNode;
                return;
            }

         
            rear.next = newNode;
            rear = newNode;
        }

  
        int pop() {

            if (empty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = front.data;

            front = front.next;

  
            if (front == null) {
                rear = null;
            }

            return value;
        }

    
        int front() {

            if (empty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }


        boolean empty() {
            return front == null;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println("Front: " + q.front());

        System.out.println("Popped: " + q.pop());
        System.out.println("Popped: " + q.pop());

        System.out.println("Front: " + q.front());

        System.out.println("Is Empty: " + q.empty());

        System.out.println("Popped: " + q.pop());
        System.out.println("Popped: " + q.pop());

        System.out.println("Is Empty: " + q.empty());
    }
}