package pack2;

public class ClassO 
{
	void meth1()
	{
		int a=10,b=5;
		//Arithmetic Operations
		int sum = a+b;
		int difference = a-b;
		int product = a*b;
		int quotient = a/b;
		int reminder = a%b;
		
		//Relational Operations
		boolean isEqula = a==b;
		boolean isNotEqual = a!=b;
		boolean isGreaterThan = a>b;
		boolean isLessThan = a<b;
		boolean isGreaterThanorEqual = a>=b;
		boolean isLessThanorEqual = a<=b;
		
		//Logical operations
		boolean logicalAND = (a>0) && (b<10);
		boolean logicalOR = (a<0) || (b>10);
		boolean logicalNOTA = !(a>0);
		boolean logicalNOTB = !(b<0);
		
		//Increment & Decrement operations
		int preIncrement = ++a;
		int postIncrement = b++;
		int preDecrement = --a;
		int postDecrement = b--;
		
		System.out.println("Arithmetic Operations");
		System.out.println("Sum :"+sum);	//15
		System.out.println("Difference :"+difference);	//5
		System.out.println("Product :"+product);	//50
		System.out.println("Quotient :"+quotient);	//2
		System.out.println("Reminder :"+reminder);	//0
		
		System.out.println("\nRelational Operations");
		System.out.println("isEqula :"+isEqula);	//false
		System.out.println("isNotEqual :"+isNotEqual);	//true
		System.out.println("isGreaterThan :"+isGreaterThan);	//true
		System.out.println("isLessThan :"+isLessThan);	//false
		System.out.println("isGreaterThanorEqual :"+isGreaterThanorEqual);	//false
		System.out.println("isLessThanorEqual :"+isLessThanorEqual);	//true
		
		System.out.println("\nLogical operations");	
		System.out.println("logicalAND :"+logicalAND);	//true
		System.out.println("logicalOR :"+logicalOR);	//false
		System.out.println("logicalNOT for A :"+logicalNOTA);	//false
		System.out.println("logicalNOT for B :"+logicalNOTB);	//true
		
		System.out.println("\nIncrement & Decrement operations");	
		System.out.println("preIncrement :"+preIncrement);	//11
		System.out.println("postIncrement :"+postIncrement);	//5
		System.out.println("preDecrement :"+preDecrement);	//10
		System.out.println("postDecrement :"+postDecrement);	//6
	}
	void meth2()
	{
		int a=10,b=5;
		//Assignment Operations
		int equalAssignment = a;	//10
		int additionAssignment = a+=b;	//Equivalent to : a=a+b
		int substractAssignment = a-=b;	//Equivalent to : a=a-b
		int multiplicationAssignment = a*=b;   //Equivalent to : a=a*b
		int divisionAssignment = a/=b;	//Equivalent to : a=a/b
		
		System.out.println("Equal Assignment :"+equalAssignment);
		System.out.println("Addition Assignment :"+additionAssignment);
		System.out.println("Substract Assignment :"+substractAssignment);
		System.out.println("Multiplication Assignment :"+multiplicationAssignment);
		System.out.println("Division Assignment :"+divisionAssignment);
	}
	public static void main(String[] args) 
	{
		ClassO aobj = new ClassO();
		aobj.meth1();
		System.out.println("--------------------------");
		aobj.meth2();
	}
	
}
