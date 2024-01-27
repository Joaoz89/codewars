	OptionalDouble av = DoubleStream.of(arr).average();

		if(av.isPresent()) {
		double leftAvg = navg - av.getAsDouble();
		double aux3 = (leftAvg * arr.length) + navg;
		
		if(aux3 < 0) throw new IllegalArgumentException();
		
		//It doesn't work because the casting isn't accurate
		//return Double.valueOf(aux3).longValue();		
		//return Math.round(aux3);
		//return (Long)aux3;
		
		return (long) Math.ceil(aux3);
		}else {
		return (long) Math.ceil(navg);
		}
//===============================================================
double add = (arr.length + 1) * navg - DoubleStream.of(arr).sum();
        if (add <= 0)
            throw new IllegalArgumentException("Expected New Average is too low");
        return (long)Math.ceil(add);

//=========================================================================
 final long n = (long)Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
        if (n <= 0) throw new IllegalArgumentException();
        return n;
