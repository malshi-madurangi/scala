//Q1
class Rational(n:Int,d:Int)
{	require(d>0,"Denomenator must be greater than 0");
	def numer = n/gcd(Math.abs(n),d);
	def denom = d/gcd(Math.abs(n),d);
	def this(n:Int) = this(n,1)
	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)

	def neg = new Rational(-this.numer,this.denom)
	
	override def toString = numer+"/"+denom;
}

object  NegRational extends App{

	val r1= new Rational(3,8);
	
	println(r1.neg);
	
}
