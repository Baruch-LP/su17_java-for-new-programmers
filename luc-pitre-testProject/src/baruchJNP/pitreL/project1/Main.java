package baruchJNP.pitreL.project1;

public class Main {//this is our main class

	public static void main(String[] args) {//here is our project's main() function
		
		// Q: why are we do this?
		
		// A: every Java project can only have a single main() function and we have 2 separate...
		// ... tasks to complete, which would require their own main() functions. ...
		// ... So instead of creating 2 different projects, we create three files inside a single ...
		// ... project: a file our task1, a file for task2, a file that contains our main() ...
		// ... function which calls the functions of our other tasks.
		
		// Let's say that we only had one task to accomplish. Then we could put everything in one ...
		// ... file which contained all our code for the task and the project's main() function.
		
		// It all depends on the project at hand.
		
		Task1.task();//calling the function in Task1.java
		Task2.task();//calling the function in Task2.java

	}

}
