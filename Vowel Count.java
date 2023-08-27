public class Vowels {

  public static int getCount(String str) {
    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
  }

}
--------------------------------------------------------------------------------------------

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    for(char c : str.toCharArray())
      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    
    return vowelsCount;
  }

}
-------------------------------------------------------------------------------------------

public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}

-------------------------------------------------------------------------------------------
public class Main01 {

	public static int bingo(String str) {
		
		String[] vowals = {"a", "e", "i", "o", "u"};
		
		int aux = 0;
		if(!(str.equals(""))) {
			
		
		for(int j = 0; j < vowals.length; j++) {
			
		for(int i = 0; i < str.length(); i++) {
			if(vowals[j].equals(str.split("")[i])) {
				aux++;
			}
		}
		}
		}else {
			return aux;
		}
	str.charAt(0);
	return aux;
	}
	}

