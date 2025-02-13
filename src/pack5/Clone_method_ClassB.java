package pack5;
//Clone Method

public class Clone_method_ClassB implements Cloneable
{
	int x=111;
	int y=222;
	Clone_method_ClassB createClone() throws CloneNotSupportedException
	{
		Clone_method_ClassB obj=(Clone_method_ClassB)super.clone();
		return obj;
	}
}
