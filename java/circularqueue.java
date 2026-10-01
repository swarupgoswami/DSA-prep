public class circularqueue {

    public static void main(String[] args) {

        int capacity = 5;
        int[] queue = new int[capacity];

        int front = 0;
        int rear = 0;
        int size = 0;

        if (size < capacity) {
            queue[rear] = 10;
            rear = (rear + 1) % capacity;
            size++;
        }

     
        if (size < capacity) {
            queue[rear] = 20;
            rear = (rear + 1) % capacity;
            size++;
        }

  
        if (size < capacity) {
            queue[rear] = 30;
            rear = (rear + 1) % capacity;
            size++;
        }

        if (size < capacity) {
            queue[rear] = 40;
            rear = (rear + 1) % capacity;
            size++;
        }

  
        if (size > 0) {
            System.out.println("Removed: " + queue[front]);
            front = (front + 1) % capacity;
            size--;
        }

        
        

      
        System.out.print("Queue: ");

        int index = front;

        for (int i = 0; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }
    }
}