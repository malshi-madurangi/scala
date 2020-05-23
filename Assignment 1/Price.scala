object Price extends App{
	
	def calculatePrice(x:Double)={(24.95*0.6*x)+(3.0*50.0)+(0.75*(x-50.0))};

	println(calculatePrice(60));
}