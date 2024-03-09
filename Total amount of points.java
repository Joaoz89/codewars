
//We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.
//if x > y: 3 points (win)
//if x < y: 0 points (loss)
//if x = y: 1 point (tie)
int x = 0;
		  for(int i=0; i<games.length; i++) {
			  String[] a = games[i].split(":");
			  if(Integer.parseInt(a[0]) > Integer.parseInt(a[1] )) x += 3;
			  else if  (Integer.parseInt(a[0]) == Integer.parseInt(a[1] )) x += 1;
		  }
		  return x; 
===================================================================
public static int points(String[] games) {
       return Arrays.stream(games)
                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                     .sum();
    }
==================================================================================
          int sum = 0;
        
        for (String s : games) {
          char x = s.charAt(0),
               y = s.charAt(2);
          
          sum += x > y ? 3 : x == y ? 1 : 0;
        }
        
        return sum;
===================================================================================
  
