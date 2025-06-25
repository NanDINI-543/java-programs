import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int queueSize = scanner.nextInt();

        System.out.print("Enter the total number of elements to add: ");
        int totalElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        Queue<Integer> queue = new LinkedList<>();

        int rotations = 0;
        int inserted = 0;
        int removedInCurrentRotation = 0;

        // First, fill the queue up to its capacity (initial load)
        while (inserted < queueSize && inserted < totalElements) {
            int element = scanner.nextInt();
            queue.offer(element);
            inserted++;
        }

        // Now, process the remaining elements
        while (inserted < totalElements) {
            // dequeue one element (simulate pop)
            queue.poll();
            removedInCurrentRotation++;

            // enqueue one new element
            int element = scanner.nextInt();
            queue.offer(element);
            inserted++;

            // if we've dequeued queueSize elements, a full rotation happened
            if (removedInCurrentRotation == queueSize) {
                rotations++;
                removedInCurrentRotation = 0;
            }
        }

        // Display final queue state
        System.out.print("Queue elements: ");
        for (int elem : queue) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("The queue was rotated " + rotations + " times.");

        scanner.close();
    }
}