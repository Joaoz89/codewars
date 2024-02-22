/*  You have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
multiply(3) == 15 # 3 * 5¹
multiply(10) == 250 # 10 * 5²
multiply(200) == 25000 # 200 * 5³
multiply(0) == 0 # 0 * 5¹
multiply(-3) == -15 # -3 * 5¹    */
public class Kata {
  public static int multiply(int number) {
 
      String len = String.valueOf(number);
		  double pow = len.length();
		  if(number < 0) pow--;;
		  
		  double a = Math.pow(5, pow );
	
		  return (int) (a * number);
}}
=======================================================
return number * (int)Math.pow(5, (Math.abs(number) + "").length());
====

int length = String.valueOf(Math.abs(number)).length();
    return number * (int) Math.pow(5, length);
