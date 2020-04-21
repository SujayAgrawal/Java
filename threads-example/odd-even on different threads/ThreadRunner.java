package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * this class will be used to understand the concepts of multithreading.
 * 
 * @author Sujay-PC
 *
 */
public class ThreadRunner {

	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		newFixedThreadPool.execute(evenThread);
		newFixedThreadPool.execute(oddThread);
		newFixedThreadPool.shutdown();
		
	}
}
