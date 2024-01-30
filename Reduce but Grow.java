//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

public static int grow(int[] x){
		  
		  int a = x[0];
		  for(int i=1; i<x.length; i++) {
			  a *=  x[i];
		  }
		  return a;
	 }

========================================================
    return IntStream.of(x).reduce(1, (a, b) -> a * b);
