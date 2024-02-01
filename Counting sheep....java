//function that counts the number of sheep present in the array (true means present).
//Hint: Don't forget to check for bad values like null/undefined
	  public static int countSheeps(Boolean[] arrayOfSheeps) {
		
		  	int aux = 0;
		  
		  for(int i = 0; i< arrayOfSheeps.length; i++) {
			  if(arrayOfSheeps[i] != null) {
				  if(arrayOfSheeps[i] == true) aux++;
			  } 
		  }	
		  	return aux; }
==========================================================
  int counter = 0;
	    for (Boolean present : arrayOfSheeps) {
	      if (present != null && present) {
	        counter += 1;
	      }
	    }
	    return counter;
===============================================================

      return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
===========================================================
      return (int) Arrays.stream(arrayOfSheeps).filter(x -> x != null && x).count(); //.toArray().length;
===============================================================================
