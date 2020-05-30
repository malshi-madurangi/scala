object AddEvenNum{

	var sum = 0;

	def addEven(n:Int):Unit= {
		if(n>0)
		{
			if(n%2==0)
			{
				sum=sum+n
			}
			addEven(n-1);
		}
		else
		{
			println(sum);
		}
	}
	
	def main(args: Array[String]){
		
		val num=scala.io.StdIn.readInt();
		addEven(num-1);
		
	}
}