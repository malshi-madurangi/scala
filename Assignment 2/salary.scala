object Salary{

	def normalHours(nHours:Int):Int=nHours*150;

	def oTHours(otHours:Int):Int=otHours*75;
	
	def totalIncome(nHours:Int,otHours:Int):Int=normalHours(nHours)+oTHours(otHours);

	def tax(income:Int):Double=income*0.1;
	
	def salary(nHours:Int,otHours:Int):Double=totalIncome(nHours,otHours)- tax(totalIncome(nHours,otHours));
	
	def main(args: Array[String]){
		
		println(salary(40,20));
	}

}
