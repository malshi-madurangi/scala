object EvenOdd{
	
	def isEven(n:Int):Boolean= n match{
		case 0 => true;
		case _ => isOdd(n-1);
	}
	
	def isOdd(n:Int):Boolean= {!(isEven(n))};
	
	def main(args: Array[String]){
		
		val num=scala.io.StdIn.readInt();
		if(isEven(num))
		{
			println("Even Number");
		}
		else
		{
			println("Odd Number");
		}
	}
}