package numericTypes;

import libs.Input;

class Floats {

	static main(args)
	{
		// prompt user for x
		print("x is ");
	    def x = Input.get_float();
	    
	    // prompt user for y
	    print("y is ");
	    def y = Input.get_float();
	    
	    // perform division for user
	    print "${x} divided by ${y} is ${x/y}"
	}
}


