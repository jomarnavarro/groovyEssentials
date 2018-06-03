package numericTypes

import libs.Input

class Ints {
	
	static main(args) {
		
		// prompt user for x
		print("x is ");
		def x = Input.get_int();
		
		// prompt user for y
		print("y is ");
		def y = Input.get_int();
		
		// perform calculations for user
		println "${x} plus ${y} is ${x + y}"
		println "${x} minus ${y} is ${x - y}"
		println "${x} times ${y} is ${x * y}"
		println "${x} divided by ${y} is ${x / y}"
		println "The remander of ${x} over ${y} is ${x % y}"
	}
}