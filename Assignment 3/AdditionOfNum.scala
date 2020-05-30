object AdditionOfNum{
	var sum=0;
	def add(n:Int):Int=n match{
		case 0 => 0
		case _ => n+add(n-1);
	}
	def main(args: Array[String]){
		
		val num=scala.io.StdIn.readInt();
		println(add(num));
		
	}
}