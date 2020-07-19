object CaesarCipher{

	def main(args : Array[String]){	
	
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val Encryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	
		val Decryption=(c:Char,key:Int,a:String)=>if ((a.indexOf(c.toUpper)-key)<0) (a((a.indexOf(c.toUpper)-key+a.size)%a.size)) else (a((a.indexOf(c.toUpper)-key)%a.size))
		
		val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

		val s="UNIVERSITYOFCOLOMBOSCHOOLOFCOMPUTING"

		val ct=cipher(Encryption,s,5,alphabet)
		println(ct)
	
		val pt=cipher(Decryption,ct,5,alphabet)
		println(pt)
	}
}
