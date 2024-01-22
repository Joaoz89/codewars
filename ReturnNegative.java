 public static int makeNegative(final int x) {
		  if(Integer.signum(x) == -1 || Integer.signum(x) == 0) {
			  return x;
		  }else {
			  return -x; }}}
-------------------------------------------
      return (a < 0) ? -a : a;
-------------------------------
     return -Math.abs(x);

		    
		  
