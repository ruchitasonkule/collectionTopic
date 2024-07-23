package queue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler{

	 private Queue<Task> pendingTasks;
	    private Queue<Task> completedTasks;

	    public TaskScheduler() {
	        pendingTasks = new PriorityQueue<>();
	        completedTasks = new LinkedList<>();
	    }

	    // Method to add tasks from a file
	    public void addTasksFromFile(String filename) {
	        try (Scanner scanner = new Scanner(new FileReader(filename))) {
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                String[] parts = line.split(",");
	                int id = Integer.parseInt(parts[0].trim());
	                String description = parts[1].trim();
	                int priority = Integer.parseInt(parts[2].trim());
	                Task task = new Task(id, description, priority);
	                pendingTasks.add(task);
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found: " + filename);
	        } catch (NumberFormatException | NoSuchElementException | ArrayIndexOutOfBoundsException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }
}