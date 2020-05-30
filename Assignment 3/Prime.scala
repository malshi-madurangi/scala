object Prime{

	def gcd(a:Int,b:Int):Int=b match{
		case 0 => a;
		case x if x>a => gcd(x,a);
		case x => gcd(x,a%x);
	}
	
	def prime(y:Int,n:Int=2):Boolean=n match{
		case x if(x==y) => true;
		case x if(gcd(y,x)>1) => false;
		case x => prime(y,x+1);

	}

	def main(args: Array[String]){
		
		val num=scala.io.StdIn.readInt();
		printf("%s",prime(num));
		
	}		
}