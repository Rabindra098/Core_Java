package pack5;

public class Student 
{
	String sName;
	String sBranch;
	int sMarks;
	public Student(String sName,String sBranch,int sMarks) 
	{
		this.sName=sName;
		this.sBranch=sBranch;
		this.sMarks=sMarks;
	}
	@Override
	public String toString()
	{
		return sName+" "+sMarks;
	}
}
