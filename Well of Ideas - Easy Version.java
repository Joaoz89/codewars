
//If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. 
//If there are no good ideas, as is often the case, return 'Fail!'.
import java.util.Arrays;
public class Kata {

  public static String well(String[] x) {
 Long a = Arrays.stream(x).filter(y -> y == "good").count();
	    		  
		    	if(a > 0) {
		    		if(a > 2) {
		    			return "I smell a series!";
		    		}else {
		    			return "Publish!";
		    		}
		    	}
		    	  return "Fail!";
	  }  }
=====================================================================
 long count = Arrays.stream(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
 =============================================================== 
 int count = 0;
      for (String s : x) {
         if (s.equals("good")) count++;
         if (count > 2) return "I smell a series!";
      }
      if (count != 0) return "Publish!";
      return "Fail!";
  }
=======================================================================
  switch (Collections.frequency(Arrays.asList(x), "good")) {
            case 1:
            case 2:
                return "Publish!";
            case 0:
                return "Fail!";
            default:
                return "I smell a series!";
        }
  }
