public class BingoOrNot {
    public static String bingo(int[] a) {
        return Arrays.stream(new int[]{2, 7, 9, 14, 15}).allMatch(n -> Arrays.stream(a).anyMatch(i -> i == n)) ? "WIN" : "LOSE";
    }
}
------------------------------------------------------------------------------------------------------------------------------
public class BingoOrNot {
    public static String bingo(int[] numberArray){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            list.add(numberArray[i]);
        }
        if (list.contains(2) && list.contains(9) && list.contains(14) && list.contains(7) && list.contains(15)) {
            return "WIN";
        } 
        return "LOSE";
    }
}
------------------------------------------------------------------------------------------------------------------------------

public class Main01 {

	public static String bingo(int[] numberArray) {
		  Scanner sc = new Scanner(System.in);
		  
		  String win = "WIN";
		  String lose = "LOSE";
		  int winBingo = 0, aux2 = 0, n;

		  ArrayList<Integer> array = new ArrayList<Integer>();		  

		  for(int i = 0; i < numberArray.length; i++) {
			  array.add(numberArray[i]);
		  }
		  	
		  ArrayList<Integer> bingo = new ArrayList<Integer>(Arrays.asList(2 ,9 ,14 ,7 ,15)); 
		 
		  for(int i = 0; i <= bingo.size(); i++) {
			 
			  if(aux2 == 10) {
				  break;
			  }
			  aux2 = 0;
			  i = 0;
			  for(int j = 0; j < array.size(); j++) {
				  if(bingo.get(i) == array.get(j)) {
					  bingo.remove(i);
					  winBingo++; 
					  break;
				  }
				  aux2++;
			  }
	}
		  sc.close();
		  
		  if(winBingo == 5) {
			  return  win ;
		  	}else {
		  		return lose;

		  	}
		  }
	}

