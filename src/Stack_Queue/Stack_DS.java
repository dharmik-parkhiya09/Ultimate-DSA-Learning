package Stack_Queue;

public class Stack_DS {

    private static int[] arr;
    private static int top;
    private static int capacity;

    public Stack_DS(int cap) {
        capacity = cap;
        arr = new int[cap];
        top = -1;
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static boolean isFull(){
        return top == capacity-1;
    }

    public static void push(int x){
        if (top == capacity-1 ){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = x;
    }

    public static int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public static int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    public static void print(){

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        for (int i =top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_DS stack = new Stack_DS(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.print();

        System.out.println("Popped : "+stack.pop());
        System.out.println("Top element : "+stack.peek());

        System.out.println("Is Stack Empty: "+(stack.isEmpty() ? "Yes" : "No"));
        System.out.println("Is Stack Full: "+(stack.isFull() ? "Yes" : "No"));



    }

}
