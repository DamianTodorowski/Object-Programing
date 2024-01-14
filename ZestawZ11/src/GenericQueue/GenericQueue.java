package GenericQueue;


import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue;

    public GenericQueue(Queue<T> queue) {
        this.queue = new LinkedList<>();
    }


    // Dodaj element do kolejki
    public void enqueue(T element) {
        queue.add(element);
    }

    // Usuń i zwróć element z początku kolejki
    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Kolejka jest pusta");
        }
        return queue.poll();
    }
}
