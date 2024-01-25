//retorna um Map<> the count of gCharacters; Ex: casa: c=1, a=2, s=1.
public static Map<Character, Integer> count(String str) {
		
		Map<Character, Integer> map = new HashMap<>(); 
  	String[] st = str.split("");

		for(int i=0; i<str.length(); i++) {
		map.put(str.charAt(i), Collections.frequency(Arrays.asList(st), st[i]));
    }
			return map; }
    
//==========================================================================================

  return str
                .chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
