package Question01;

public class main {

	public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();

        printerQueue.enqueue("Task 1");
        printerQueue.enqueue("Task 2");
        printerQueue.enqueue("Task 3");
        printerQueue.enqueue("Task 4");
        

        System.out.println("Is printer queue empty? " + printerQueue.isEmpty());
        System.out.println("Front of the queue: " + printerQueue.peek());

        String task = printerQueue.dequeue();
        System.out.println("Dequeued task: " + task);

        System.out.println("Is printer queue empty? " + printerQueue.isEmpty());
        System.out.println("Front of the queue: " + printerQueue.peek());
        
        printerQueue.clear();
        System.out.println("Is printer queue empty? " + printerQueue.isEmpty());
    }

}
