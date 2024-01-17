//Receba um List de obj e retorne somente os int
public static List<Object> filterList(final List<Object> list) {
	 			  
	 			  List<Object> list2 = new ArrayList<>();

	 			 List<Boolean> b = list.stream().map(x -> (x instanceof Integer)).collect(Collectors.toList()); 
	 			 
	 			 for(int i = 0; i < list.size(); i++ ) {
	 				if(b.get(i) == true) {
	 					list2.add(list.get(i));
	 				}
	 			 }
	 				  return list2; 
	 		}
----------------------------------------------------------------------------------------------------------------------------- 
public static List filterList(final List<Object> list) {
    return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());    }
----------------------------------------------------------------------------------------------------------------      
  static List<Object> filterList(List<Object> list) {
    return list.stream().filter(Integer.class::isInstance).toList();
  }
