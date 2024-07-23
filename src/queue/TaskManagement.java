package queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TaskManagement {


	
	private PriorityQueue<Task> priorityQueue;
	private PriorityQueue<Task> arrayDequeQueue;
	private Object linkedListQueue;


	public void sortLinkedListByPriority() {
	    
		// Sorting the linked list queue by task priority
	    ((Object) linkedListQueue).sort(new Comparator<Task>() {
	        @Override
	        public int compare(Task task1, Task task2) {
	            return Integer.compare(task1.getPriority(), task2.getPriority());
	        }
	    });
	}
	
	
	public void moveTasksBelowThreshold(int threshold) {
	    Iterator<Task> iterator = arrayDequeQueue.iterator();
	    while (iterator.hasNext()) {
	        Task task = iterator.next();
	        if (task.getPriority() < threshold) {
	            priorityQueue.add(task);  // Add task to PriorityQueue
	            iterator.remove();        // Remove task from ArrayDeque
	        }
	    }
	}
	
	
	 // Method to merge two PriorityQueue instances into one, maintaining priority order
    public PriorityQueue<Task> mergePriorityQueues(PriorityQueue<Task> pq1, PriorityQueue<Task> pq2) {
        PriorityQueue<Task> mergedQueue = new PriorityQueue<>(pq1);
        mergedQueue.addAll(pq2);
        return mergedQueue;
    }

}