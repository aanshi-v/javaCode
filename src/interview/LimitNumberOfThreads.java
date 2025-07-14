package interview;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * Quest: 9.3 - How do you limit the number of threads used in parallel streams? 
 * 
 * To limit the number of threads used in Java 8 parallel streams, you need to provide a custom ForkJoinPool,
 *  because by default, parallel streams use the common ForkJoinPool, which typically has a number of threads equal to
 *   the number of available processors (Runtime.getRuntime().availableProcessors()).
 *   
 *   
 * The parallelStream() by default uses the common pool, but wrapping it inside ForkJoinPool.submit() lets you control the thread limit.

   Use .join() to block until the task is done.

   Be cautious using this in a web server or shared environment — don’t starve the common pool or create too many custom pools.

 */
public class LimitNumberOfThreads {

	public static void main(String[] args) {
//Step 1: Create a custom ForkJoinPool
		
		ForkJoinPool customThreadPool = new ForkJoinPool(4); // limit to 4 threads
		
//Step 2: Submit parallel stream code to the pool
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		customThreadPool.submit(() -> 
		list.parallelStream().forEach(i -> {
			System.out.println(Thread.currentThread().getName() + "processing" + i);
		})
				).join();    // Wait for completion

	}

}
