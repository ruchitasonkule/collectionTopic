package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TaskManager {


	     
	
	private LinkedList<Task> linkedListQueue;
    private PriorityQueue<Task> priorityQueue;
    private ArrayDeque<Task> arrayDequeQueue;

    public TaskManager() {
        linkedListQueue = new LinkedList<>();
        priorityQueue = new PriorityQueue<>();
        arrayDequeQueue = new ArrayDeque<>();
    }
    
	 // Method to add Task objects to different queues
	    public void addTask(Task task) {
	        linkedListQueue.add(task);
	        priorityQueue.add(task);
	        arrayDequeQueue.add(task);
	    }

		public LinkedList<Task> getLinkedListQueue() {
			return linkedListQueue;
		}

		public void setLinkedListQueue(LinkedList<Task> linkedListQueue) {
			this.linkedListQueue = linkedListQueue;
		}

		public PriorityQueue<Task> getPriorityQueue() {
			return priorityQueue;
		}

		public void setPriorityQueue(PriorityQueue<Task> priorityQueue) {
			this.priorityQueue = priorityQueue;
		}

		public ArrayDeque<Task> getArrayDequeQueue() {
			return arrayDequeQueue;
		}

		public void setArrayDequeQueue(ArrayDeque<Task> arrayDequeQueue) {
			this.arrayDequeQueue = arrayDequeQueue;
		}	}
	  