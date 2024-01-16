public String spinWords(String sentence) {
		 List<String> s = Arrays.asList(sentence.split(" "));
		
		 String aux2 = "";
		 String aux4 = "";

		 for(int i = 0; i < s.size(); i++) {
			 if(s.get(i).length() > 4) {
				 
				 for(int j = s.get(i).length(); j >0; j--) {					
					 aux2 += s.get(i).charAt(j - 1);
				 }
				 aux2 += " ";
			 }else {
				 aux2 += s.get(i) + " ";
			 }
		 }
		     aux4 = aux2.substring(0, aux2.length() - 1);
		 return aux4; 
	 }
-------------------------------------------------------------------------------------------------
public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}
