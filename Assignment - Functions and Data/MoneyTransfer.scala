//Q3
class Account(id:String, number: Int, b: Double) 
{
	val nic:String=id
	val accnumber: Int = number
	var balance: Double = b
	
	def withdraw(amount:Double) = if(this.balance>amount) this.balance=this.balance-amount else println("Unable to withdraw money.There is not enough money in your account.");  

	def deposit(amount:Double) = this.balance=this.balance+amount

	def transfer(acc:Account,amount:Double)= 
	{
		this.withdraw(amount);
		acc.deposit(amount);
	}

	override def toString ="["+nic+":"+accnumber +":"+ balance+"]"
}

object  MoneyTransfer extends App{

	var acc1= new Account("111001v",100012,4512.20);
	var acc2= new Account("111002v",100013,1478.56);
	var acc3= new Account("111003v",100014,5489.36);

	var bank:List[Account]=List(acc1,acc2,acc3)

	acc1.transfer(acc3,500)
	
	println("*****Money Transfer*****");
	println(acc1);
	println(acc3);

	
}