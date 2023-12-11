package Question01;


import java.util.LinkedList;
import java.util.Queue;

class PrinterQueue {
    private Queue<String> queue;

    public PrinterQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(String printTask) {
        queue.add(printTask);
        System.out.println("Added print task: " + printTask);
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Printer queue is empty");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Printer queue is empty");
            return null;
        }
        return queue.peek();
    }

    public void clear() {
        queue.clear();
        System.out.println("Cleared all print tasks from the queue");
    }

}
