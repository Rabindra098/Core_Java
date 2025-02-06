package pack2;
/*
 6) A student will not be allowed to sit in exam if his/her attendance is less than 75%.
    Take a parameterized method which takes
    ===> Number of classes held
    ===> Number of classes attended.
    And print percentage of class attended
    Is student is allowed to sit in exam or not.
 */
public class ClassAM 
{
	void CheckAllowExam(int no_of_cl_held,int no_of_cl_attend)
	{
		double total_pr_of_cl_attend=no_of_cl_held/(no_of_cl_attend*100);
		System.out.println("Student total percentage of class attended is "+total_pr_of_cl_attend+"%");
		if (total_pr_of_cl_attend>(75/100)) 
		{
			System.out.println("The student is allowed to sit in exam");
		}
		else 
		{
			System.out.println("The student is not allowed to sit in exam");
		}
	}
	public static void main(String[] args) 
	{
		ClassAM aobj = new ClassAM();
		aobj.CheckAllowExam(100,75);
	}
}
