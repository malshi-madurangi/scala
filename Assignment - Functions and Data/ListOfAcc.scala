//Q4
class Account(id:String, number: Int, b: Double) 
{
	val nic:String=id
	val accNumber: Int = number
	var balance: Double = b
	
	override def toString ="["+nic+":"+accNumber +":"+ balance+"]"
}

object  ListOfAcc{
	def main(args:Array[String])
	{
		var acc1= new Account("111001v",100010,4512.20);
		var acc2= new Account("111002v",100011,1478.56);
		var acc3= new Account("111003v",100012,-145.23);
		var acc4= new Account("111004v",100013,74582.12);
		var acc5= new Account("111005v",100014,-1500.00);
		var acc6= new Account("111006v",100015,3578.45);
		var acc7= new Account("111007v",100016,1750.20);
		var acc8= new Account("111008v",100017,-1000.50);
		var acc9= new Account("111009v",100018,6314.10);
		var acc10= new Account("111010v",100019,125.60);
	
		var bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5,acc6,acc7,acc8,acc9,acc10)

		print("Negative balance account numbers : ");
		var ODlist=negBalance(bank);
		ODlist.foreach(x=>print(x.accNumber+"   "));
		
		var sumOfBalance=sum(bank);
		print("\nSum of accounts balance : "+sumOfBalance.balance);

		print("\nAccount balances with interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));
	
	}


	val negBalance=(list:List[Account])=>list.filter(x=>x.balance<=0);
	val sum=(list:List[Account])=>list.reduce((x,y)=>new Account("111001v",10,x.balance+y.balance));
	val interest=(list:List[Account])=>list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.01d));

	
}
