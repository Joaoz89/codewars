 public static String bingo(int[] a) { //Bing or not
        return Arrays.stream(new int[]{2, 7, 9, 14, 15}).allMatch(n -> Arrays.stream(a).anyMatch(i -> i == n)) ? "WIN" : "LOSE"; } }

----------------------------------------------------------------------------------------------------------------------------------------
    
