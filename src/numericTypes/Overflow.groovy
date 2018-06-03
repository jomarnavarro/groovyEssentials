package numericTypes;

 class Overflow {

	 static main(args){
		int n = 1;
	    for (i in 1 .. 64) {
	    	println "n: ${n}"
	        n = n * 2;
	    }
	}
}



