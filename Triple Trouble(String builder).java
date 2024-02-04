//    assertEquals("LexLuthor", Kata.tripleTrouble("LLh","euo","xtr"));

//E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
StringBuilder sb = new StringBuilder(s1.length()*3);
    for (int i=0; i<s1.length(); i++) {
      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
    }
    return sb.toString();
