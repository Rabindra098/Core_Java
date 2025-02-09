package pack5;

import java.util.Comparator;

public class Compartor_Class implements Comparator<Employee_3rd_Class>
{
	@Override
	public int compare(Employee_3rd_Class o1, Employee_3rd_Class o2) 
	{
		return	o1.getEmpSal()-o2.getEmpSal();
//		return o1.getEmpName().compareTo(o2.getEmpName());
//		return o1.getEmpDept().compareTo(o2.getEmpDept());
		
	}
}
