//take a value, integer, and returns a list of its multiples up to another value,
//For example, if the parameters passed are (2, 6), 
//the function should return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.
//desconsider the 0
import static java.util.stream.IntStream.iterate;
import java.util.stream.IntStream;

public class T1 {
		
    public static int[] find(int base, int limit) {
		  
    	return IntStream.rangeClosed(1, limit / base).map(x -> base * x).toArray();

        return IntStream.rangeClosed(base, limit).filter(n -> n % base == 0).toArray();

	
         return iterate(base, i -> i <= limit, i -> i + base).toArray();
	  return iterate(base, i -> i + base).limit(20).toArray(); //Up to 20

        // seed: initial element
        //hasNext: A predicate to determine when stream must terminate
        //next: a function to be aplplied to the previous element to produce a new element
        
}}

