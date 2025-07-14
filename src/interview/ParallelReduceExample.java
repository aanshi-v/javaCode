package interview;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Quest:9.8 - Write a performance-sensitive example using parallel stream with reduce. 
 */
public class ParallelReduceExample {

	public static void main(String[] args) {
		
		// Generate a list of long numbers from 1 to 10 million
        List<Long> numbers = LongStream.rangeClosed(1, 10_000_000)
                                       .boxed()
                                       .collect(Collectors.toList());

        // Measure time for sequential sum
        Instant startSeq = Instant.now();
        long sequentialSum = numbers.stream()
                                    .reduce(0L, Long::sum);
        Instant endSeq = Instant.now();
        System.out.println("Sequential sum = " + sequentialSum +
                           ", Time = " + Duration.between(startSeq, endSeq).toMillis() + " ms");

        // Measure time for parallel sum
        Instant startPar = Instant.now();
        long parallelSum = numbers.parallelStream()
                                  .reduce(0L, Long::sum);
        Instant endPar = Instant.now();
        System.out.println("Parallel sum   = " + parallelSum +
                           ", Time = " + Duration.between(startPar, endPar).toMillis() + " ms");
	}

}
