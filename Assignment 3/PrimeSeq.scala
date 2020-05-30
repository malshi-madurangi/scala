object PrimeSeq{
	var i:Int=2;

	def gcd(a:Int,b:Int):Int=b match{
		case 0 => a;
		case x if x>a => gcd(x,a);
		case x => gcd(x,a%x);
	}
	
	def prime(y:Int,m:Int=2):Boolean=m match{
		case x if(x==y) => true;
		case x if(gcd(y,x)>1) => false;
		case x => prime(y,x+1);
	}
	
	def primeSeq(n:Int):Unit={
		if(n>1)
		{
			primeSeq(n-1);
			if(prime(n))
			{
				println(n);
			}
		}
			
	}	
	def main(args: Array[String]){
		
		val num=scala.io.StdIn.readInt();
		primeSeq(num);
		

	}		
}