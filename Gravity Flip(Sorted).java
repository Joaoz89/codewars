
   public static int[] flip(char dir, int[] arr) {
        
    if (dir == 'L') {
          arr = Arrays.stream(arr)
                  .boxed()
                  .sorted(Collections.reverseOrder())
                  .mapToInt(Integer::intValue)
                  .toArray();
    } else{
      Arrays.sort(arr);
    }
    
    return arr;
  }
===========================================================================================
      return Arrays.stream(arr).boxed()
                 .sorted(dir=='L'? (a,b)->b-a : (a,b)->a-b)
                 .mapToInt(Integer::intValue)
                 .toArray();
  }
==============================================================
   
  return of(arr).boxed().sorted((a, b) -> dir > 77 ? a - b : b - a).mapToInt(i -> i).toArray();
