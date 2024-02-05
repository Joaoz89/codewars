//Given an array of integers as strings and numbers,
//return the sum of the array values as if all were numbers.
import java.util.ArrayList;
public int sum(List<?> mixed) {	

		List<Integer> list = new ArrayList<>();
		int s = 0;
		for(Object obj : mixed) {
				if(obj instanceof String) {
					list.add(Integer.valueOf((String) obj));
					
				}else {
					list.add((Integer) obj);
				}
	  }
		return list.stream().mapToInt(Integer::intValue).sum();
	}
}
===============================================================
return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
