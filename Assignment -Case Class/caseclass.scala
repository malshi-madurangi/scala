import math.{ sqrt, pow }

case class point(x:Int , y:Int)
{
	def +(that:point) = point(this.x+that.x , this.y+that.y);

	def move(dx:Int , dy:Int) = point(this.x+dx , this.y+dy);

	def distance(that: point): Double = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));

	def invert() = point(this.y , this.x);
	
}

object  caseclass extends App{

	val p1 = point(5,7);
	val p2 = point(4,5);
	val p3 = point(9,1);
	val p4 = point(2,6);

	val p5 = p1.move(4,1);
	val p6 = p2.distance(p3);
	val p7 = p4.invert();


	println(p1+p2);
	println(p5);
	println(p6);
	println(p7);
}