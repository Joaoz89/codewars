	public static String rps(String p1, String p2) {
	 		String aux = "";
	 		
	 		if(p1.equals(p2)) {
	 			aux = "Draw!";
	 	
	 		}else {
	 			 aux = p1 + " " + p2;
		 		Map<String, String> map = Map.of(
		 			 "scissors paper", "Player 1 won!",
		 			 "paper scissors", "Player 2 won!",
		 			 "rock scissors", "Player 1 won!",
		 			 "scissors rock", "Player 2 won!",
		 			 "paper rock", "Player 1 won!",
		 			 "rock paper", "Player 2 won!"

		 			);
	 			for (Map.Entry<String, String> m :  map.entrySet()) {
		             if(m.getKey().equals(aux)) {
		            	 aux = m.getValue();
		            	 break;
		             }
		 		}
	 		}
	 		return aux;
	 		}
---------------------------------------------------------------------------------------
  public class Kata {
  public static String rps(String p1, String p2) {
    return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
  }
}
-------------------------------------------------------------------------------------------------------------------------
  public class Kata {
  public static String rps(String p1, String p2) {
    if(p1 == p2) return "Draw!";
    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
    return "Player " + p + " won!";
  }
}
