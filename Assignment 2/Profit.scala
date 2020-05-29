object Profit{
	
	def noOfAttendees(ticketP:Int):Int=120+(15-ticketP)/5*20;	

	def revenue(ticketP:Int):Int=noOfAttendees(ticketP)*ticketP;

	def cost(att:Int):Int=500+(3*att);

	def profit(ticketP:Int):Int=revenue(ticketP)-cost(noOfAttendees(ticketP));

	def main(args: Array[String]){
		
		val ticketP=scala.io.StdIn.readInt();
		printf("%d",profit(ticketP));
		

	}
} 