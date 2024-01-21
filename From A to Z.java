public static String gimmeTheLetters(String s){
	
		if(!(s.charAt(0) == s.charAt(2))) {
			
			 String w = "abcdefghijklmnopqrstuvwxyz";
			   	String aux = "";
		        aux = s.toLowerCase();

				char a = aux.charAt(0);
				String aux2 = String.valueOf(a); 	
				String[] b = w.split(aux2);
				w = aux2 += b[1];
				
				a = aux.charAt(2);
				aux2 = String.valueOf(a);
				b = w.split(aux2);
				w = b[0] += aux2;

				if (!(s.equals(aux))) {
					w = w.toUpperCase();
				}
				return w;
				}
		return String.valueOf(s.charAt(0));
	  }
--------------------------------------------------------------------------
  String result = "";
		    for( char i = s.charAt(0); i <= s.charAt(2); i++)
		    {
		      result += i;
		    }
		    return result;
		  }
----------------------------------------------------------------------------
   return IntStream.rangeClosed((int)(s.charAt(0)), (int)(s.charAt(2))).mapToObj(e -> String.valueOf((char)e)).collect(Collectors.joining(""));
-------------------------------------------------------------------------------
   public static String gimmeTheLetters(String s) {
    return IntStream.rangeClosed(s.charAt(0), s.charAt(2))
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
  }
