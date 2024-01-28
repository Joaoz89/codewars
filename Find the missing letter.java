 public static char findMissingLetter(char[] array){
    char expectableLetter = array[0];
    for(char letter : array){
      if(letter != expectableLetter) break;
      expectableLetter++;
    }
    return expectableLetter;
  }
=============================================================

  char expectableLetter = array[0];
    for(char letter : array){
      if(letter != expectableLetter) break;
      expectableLetter++;
    }
    return expectableLetter;
 
================================

int index = IntStream.range(0, array.length-1).filter(i -> array[i] != array[i+1]-1).findFirst().getAsInt();
      return (char)(array[index] + 1);