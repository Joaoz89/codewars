public static int[] countPositivesSumNegatives(int[] input) {
	   
    	if(!(input == null || input.length == 0)) {
    	List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
	    
	    
	    int b = (int) list.stream().filter(x -> x != null && x > 0 ).count();
	    // int a = list.stream().filter(x -> x != null && x < 0).reduce(0, (y,z) -> y + z, Integer::sum);
	    int a = list.stream().filter(x -> x != null && x < 0).reduce(0, Integer::sum);

	    return new int[] {b ,a};
}else {
	return new int[] {};
}}
    =========================================================================================	
    public static int[] countPositivesSumNegatives(int[] input) {
    return input == null || input.length == 0 ? 
      new int[0] : 
      new int[] { (int)IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
  }
=====================================================================================

  import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.summarizingInt;

import java.util.Arrays;

public  class T1 {
	
    public static int[] countPositivesSumNegatives(int[] input) {
	   
    	{
    	      if (input == null || input.length == 0) return new int[0];
    	      var partition = Arrays.stream(input)
    	          .boxed()
    	          .collect(partitioningBy(e -> e > 0, summarizingInt(Integer::intValue)));
    	     
    	      return new int[]{
    	          (int) partition.get(Boolean.TRUE).getCount(),
    	          (int) partition.get(Boolean.FALSE).getSum()
    	      };
    }}}
