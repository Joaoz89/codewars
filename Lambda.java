//sum only the number that don`t repeat
return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();

//invert the elements (Ex: -1, -2, 7 to 1, 2, -7)
return Arrays.stream(array).map(Math::negateExact).toArray();
return java.util.Arrays.stream(array).map(i -> -i).toArray();

//Check how many (letter) are in the String (str);
return (int)str.chars().filter(x -> x == letter).count();

//Convert Array or List of int to Integer
Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

// To boxed list
List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );




Stream<Integer> numbers = Stream.iterate(0, n -> n + 10);

==========================================
int sum = numbers.stream().reduce(0, (a, b) -> a + b);

==================================

Optional<Transaction> =   transactions.stream()

     .filter(t -> t.getType() == Transaction.GROCERY)   
   .findAny();

==============================================================
public static String bingo(int[] a) { //Bing or not
        return Arrays.stream(new int[]{2, 7, 9, 14, 15}).allMatch(n -> Arrays.stream(a).anyMatch(i -> i == n)) ? "WIN" : "LOSE"; } }
//===========================================================================================================

    return IntStream.rangeClosed(s.charAt(0), s.charAt(2)) //From A To Z
     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) .toString();}

 String result = "";
		    for( char i = s.charAt(0); i <= s.charAt(2); i++)
		    {
		      result += i;
		    }
		    return result;
		  }
//==============================================================================================================

public static List filterList(final List<Object> list) { ////Receba um List de obj e retorne somente os int
    return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());    }
//or
    return list.stream().filter(Integer.class::isInstance).toList();
//or
    return list.stream().filter(not(li -> li instanceof String)) .collect(Collectors.toList());
//=================================================================================================================

 return (a < 0) ? -a : a;  //or   
 return -Math.abs(x);
//=========================================================

 public String spinWords(String sentence) { //Take a String and return all that have 5 o more word reversed                                                                        
    return Arrays.stream(sentence.split(" ")).map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" ")); }
//======================================================================================================

//Return the number (count) of vowels in the given string.  
//indexOf(ch) returns -1 if the value ch is not found in the string ("aeiou" in this case), else it will return the position
return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();

//they used a regular expression to create a new string that only contains the vowels from the original string, then got the length of that vowels-only string
return str.replaceAll("(?i)[^aeiou]", "").length();
//===============================================================================================================================================================

        return names.length == 0 ? "no one likes this" : names.length == 1 ? names[0] + " likes this" : names.length == 2 ? names[0] + " and " + names[1] + " like this" : names.length == 3 ? names[0] + ", " + names[1] + " and " + names[2] + " like this" : names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);}
//========================================================================================================================

    return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";

     if(p1 == p2) return "Draw!";
    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
    return "Player " + p + " won!";
//============================================================================================================================


