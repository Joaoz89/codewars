//If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.
//Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of petals. 
//The number of petals is always greater than 0.
	public static String howMuchILoveYou(int nb_petals){
		
		while(nb_petals > 6)nb_petals -= 6;
		Map<Integer, String> petals = Map.of(1,"I love you", 2,"a little", 3,"a lot" , 4,"passionately" ,5,"madly" ,6,"not at all");
		return petals.get(nb_petals);	 }
==============================================================

   String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
    
   return arr[nb_petals%6];
