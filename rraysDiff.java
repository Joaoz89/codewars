public static int[] arrayDiff(int[] a, int[] b) {
		
		
		//See Collectors.toList(): "There are no guarantees on the type, mutability,serializability, or thread-safety of the List returned"
	       // List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		
		    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
		    List<Integer> listB = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

	        listA.removeAll(listB);
	        return listA.stream().mapToInt(e -> e).toArray();
}
//=========================================================================================
return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
