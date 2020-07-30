//Q2
class Rational(n:Int,d:Int)
{	
	require(d>0,"Denomenator must be greater than 0");

	def numer = n/gcd(Math.abs(n),d);
	def denom = d/gcd(Math.abs(n),d);

	def this(n:Int) = this(n,1);

	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);

	def neg = new Rational(-this.numer,this.denom);

	def +(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom);
	
	def-(r:Rational) = this+r.neg;

	override def toString = numer+"/"+denom;
}

object  SubRational extends App{

	val x= new Rational(3,4);
	val y= new Rational(5,8);
	val z= new Rational(2,7);
	val r = x-y-z;
	println(r);
	
}
