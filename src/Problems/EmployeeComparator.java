package Problems;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> 
{
	    public int compare(Employee e1, Employee e2) {
	        if (Double.compare(e2.salary, e1.salary) != 0) {
	            return Double.compare(e2.salary, e1.salary); // Sort by salary in descending order
	        }
	        return e1.name.compareTo(e2.name); // Sort by name in ascending order if salaries are the same
	    }
	}


