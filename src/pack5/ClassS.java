package pack5;
//Clone Method

public class ClassS implements Cloneable
{
	int x=111;
	int y=222;
	ClassS createClone() throws CloneNotSupportedException
	{
		ClassS obj=(ClassS)super.clone();
		return obj;
	}
}
