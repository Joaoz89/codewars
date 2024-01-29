//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
 public static int sum(int[] numbers){
	  
		 if(!(numbers == null)) {
		 int aux = IntStream.of(numbers).max().getAsInt();
		 int aux2 = IntStream.of(numbers).min().getAsInt();

		 int r = IntStream.of(numbers).sum();
	    return r - (aux + aux2);
	  }else {
		  return 0; } }
==============================================================================
  
if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
		    int min,max,sum;
		    sum = min = max = numbers[0];
		    for (int i = 1; i < numbers.length; i++)
		    {
		      sum += numbers[i];
		      if (numbers[i] < min) min = numbers[i];
		      if (numbers[i] > max) max = numbers[i];
		    }
		    return sum - min - max;
==========================================================
return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();

