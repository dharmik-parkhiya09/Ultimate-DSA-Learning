package Stack_Queue;

public class Queue_DS {

    private static int[] arr;
    private static int capacity;
    private static int size;

    public Queue_DS(int capacity) {
        Queue_DS.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public static void enqueue(int data){
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[size++] = data;
    }

    public static void dequeue(){
        if (size == 0){
            System.out.println("Queue Underflow");
            return;
        }
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    public static int getFront(){
        if (size == 0){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[0];
    }

    public static int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[size - 1];
    }

    public static void print(){
        if (size == 0){
            System.out.println("Queue is empty!");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Queue_DS queue = new Queue_DS(4);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);

        print();

        System.out.println("Front : "+ getFront());

        dequeue();
        System.out.println("dequeued");
        System.out.println("Front : "+ getFront());
        System.out.println("Rear : "+ getRear());

        enqueue(5);
    }


}
