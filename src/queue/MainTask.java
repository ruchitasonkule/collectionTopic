package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainTask{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  TaskManager taskManager = new TaskManager();

	        
	        taskManager.addTask(new Task(1, "Task 1", 3));
	        taskManager.addTask(new Task(2, "Task 2", 1));
	        taskManager.addTask(new Task(3, "Task 3", 2));
	        taskManager.addTask(new Task(4, "Task 4", 3)); 
	        taskManager.addTask(new Task(5, "Task 5", 1));
	        
	        System.out.print("LinkedList Queue: ");
	        System.out.println(taskManager.getLinkedListQueue());

	    
	        System.out.print("PriorityQueue: ");
	        System.out.println(taskManager.getPriorityQueue());

	   
	        System.out.print("ArrayDeque Queue: ");
	        System.out.println(taskManager.getArrayDequeQueue());
	   
	        
	        Task dequeuedLL = taskManager.getLinkedListQueue().poll();
	        System.out.print("Dequeued from LinkedList Queue: ");
	        System.out.println(dequeuedLL);

	    
	        Task dequeuedPQ = taskManager.getPriorityQueue().poll();
	        System.out.print("Dequeued from PriorityQueue: ");
	        System.out.println(dequeuedPQ);

	        Task dequeuedAD = taskManager.getArrayDequeQueue().poll();
	        System.out.print("Dequeued from ArrayDeque Queue: ");
	        System.out.println(dequeuedAD);
	   
		        Task peekLL = taskManager.getLinkedListQueue().peek();
		        System.out.print("Peek LinkedList Queue: ");
		        System.out.println(peekLL);
	
		     
		        Task peekPQ = taskManager.getPriorityQueue().peek();
		        System.out.print("Peek PriorityQueue: ");
		        System.out.println(peekPQ);
	
		        Task peekAD = taskManager.getArrayDequeQueue().peek();
		        System.out.print("Peek ArrayDeque Queue: ");
		        System.out.println(peekAD);
		        
		        
		    
		        Task task1LL = new Task(1, "Task 1", 3);
		        boolean existsLL = taskManager.getLinkedListQueue().contains(task1LL);
		        System.out.println("Task 1 exists in LinkedList Queue: " + existsLL);

		        
		        Task task4PQ = new Task(4, "Task 4", 3);
		        boolean existsPQ = taskManager.getPriorityQueue().contains(task4PQ);
		        System.out.println("Task 4 exists in PriorityQueue: " + existsPQ);

		        
		        Task task5AD = new Task(5, "Task 5", 1);
		        boolean existsAD = taskManager.getArrayDequeQueue().contains(task5AD);
		        System.out.println("Task 5 exists in ArrayDeque Queue: " + existsAD);

	}

}
/*public class Main {

		public static void main(String[] args) {
	        TaskScheduler scheduler = new TaskScheduler();

	        Task task1 = new Task(1, "Task 1", 3);
	        Task task2 = new Task(2, "Task 2", 1);
	        Task task3 = new Task(3, "Task 3", 2);
	        Task task4 = new Task(4, "Task 4", 4);
	        Task task5 = new Task(5, "Task 5", 1);

	        scheduler.addTask(task1);
	        scheduler.addTask(task2);
	        scheduler.addTask(task3);
	        scheduler.addTask(task4);
	        scheduler.addTask(task5);

	        System.out.println("Pending tasks:");
	        for (Task task : scheduler.viewPendingTasks()) {
	            System.out.println(task);
	        }

	        scheduler.completeTask(task2);

	        System.out.println("Completed tasks:");
	        for (Task task : scheduler.completedTasks) {
	            System.out.println(task);
	        }

	        System.out.println("Tasks in range [1, 3]:");
	        for (Task task : scheduler.findTasksInRange(1, 3)) {
	            System.out.println(task);
	        }

	        // Performance analysis
	        long startTime, endTime;
	        int numElements = 1000000;

	        // LinkedList
	        Queue<Task> linkedList = new LinkedList<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            linkedList.add(new Task(i, "Task " + i, i % 10));
	        }
	        endTime = System.nanoTime();
	        System.out.println("LinkedList enqueue time: " + (endTime - startTime) + " ns");

	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            linkedList.poll();
	        }
	        endTime = System.nanoTime();
	        System.out.println("LinkedList dequeue time: " + (endTime - startTime) + " ns");

	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            linkedList.peek();
	        }
	        endTime = System.nanoTime();
	        System.out.println("LinkedList peek time: " + (endTime - startTime) + " ns");

	        // PriorityQueue
	        Queue<Task> priorityQueue = new PriorityQueue<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            priorityQueue.add(new Task(i, "Task " + i, i % 10));
	        }
	        endTime = System.nanoTime();
	        System.out.println("PriorityQueue enqueue time: " + (endTime - startTime) + " ns");

	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            priorityQueue.poll();
	        }
	        endTime = System.nanoTime();
	        System.out.println("PriorityQueue dequeue time: " + (endTime - startTime) + " ns");

	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            priorityQueue.peek();
	        }
	        endTime = System.nanoTime();
	        System.out.println("PriorityQueue peek time: " + (endTime - startTime) + " ns");

	}

}*/
