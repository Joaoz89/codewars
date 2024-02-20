
/*You will receive an array as parameter that contains 1 or more integers and a number n.

Step 1: Split the array in two:

[1, 2, 5, 7, 2, 3, 5, 7, 8]
      /            \
[1, 2, 5, 7]    [2, 3, 5, 7, 8]
Step 2: Put the arrays on top of each other:

   [1, 2, 5, 7]
[2, 3, 5, 7, 8]
Step 3: Add them together:

[2, 4, 7, 12, 15]
Repeat the above steps n times or until there is only one number left, and then return the array. */
public static int[] splitAndAdd(int[] numbers, int n) {

int[] aux = Arrays.copyOf(numbers, numbers.length);
		
		for (int j = 0; j < n; j++) {
			if(aux.length == 1) return new int[] {aux[0]};
			else if (aux.length < 3) return new int[] { aux[0] + aux[1] };
							
			int[] c = Arrays.copyOfRange(aux, 0, aux.length / 2);
			int[] d = Arrays.copyOfRange(aux, aux.length / 2, aux.length);
			aux = new int[d.length];

			if (!((c.length + d.length) % 2 == 0)) {
				aux[0] = d[0];

				for (int i = 0; i < c.length; i++) {

					aux[i + 1] = c[i] + d[i + 1];
				}
			} else {
				for (int i = 0; i < c.length; i++) {

					aux[i] = c[i] + d[i];
				}
			}
			if (aux.length == 1) {
				break;
			}
    }
		return aux; }
  
=============================================================================
  public static int[] splitAndAdd(int[] numbers, int n) {
        int[] arr = Arrays.copyOf(numbers, numbers.length);
        while (arr.length > 1 && n-- > 0) {
            int[] tmp = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            for (int i = 0 ; i < arr.length/2 ; i++) tmp[i + arr.length%2] += arr[i];
            arr = tmp;
        }
        return arr;
    }
===============================================================
  public static int[] splitAndAdd(int[] numbers, int n) {
        if ( numbers.length < 2 || 0 == n ) return numbers;
        int arr[] = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);
        for (int i = numbers.length % 2 == 0 ? 0 : 1, j = 0; j < numbers.length / 2; i++, j++)
            arr[i] += numbers[j];
        return splitAndAdd(arr, n-1);
    }
