package pack2;

public class ClassAP 
{
	void meth1(double num1,double num2,char oprator)
	{
		switch (oprator) {
		case '+':
			System.out.println("Addition :"+(num1+num2));
			break;
		case '-':
			System.out.println("Substraction :"+(num1-num2));
			break;
		case '*':
			System.out.println("Multipliction :"+(num1*num2));
			break;
		case '/':
			System.out.println("Divission :"+(num1/num2));
			break;
		}
	}
	public static void main(String[] args) 
	{
		new ClassAP().meth1(10,20,'/');
	}
}
