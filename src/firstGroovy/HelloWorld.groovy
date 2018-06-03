package firstGroovy

class HelloWorld {

	static main(args) {
		println "Hello world!"
		
		def x = 1
		println x
		
		x = new java.util.Date()
		println x
		x = -3.1499392
		println x
		x = false
		println x
		x = "Groovy!"
		println x
		def technologies = []
		technologies.add("GRails")
		
		technologies << "Groovy"
		technologies.addAll(["Gradle", "Griffon"])
		
		println technologies
		
		technologies.remove("Griffon")
		technologies = technologies - 'Grails'
		
		println technologies
		
		technologies.each {println "TEchnology $it"}
		technologies.eachWithIndex  {it, i -> println "Technology $i: $it" }
		println technologies.contains('Groovy')
		
		println 'Groovy' in technologies
		
		technologies.sort()
		
		println technologies.sort()
		
		def devMap = [:]
		
		devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
		devMap.eachWithIndex {it, i -> println "$i: $it"}
		
		assert devMap.containsKey('name')
		assert devMap.containsValue('Roberto')
		
		println devMap.keySet()
		println devMap.values()
		
		
	}

}
