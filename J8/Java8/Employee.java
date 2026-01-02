package Java8;

import java.util.Optional;

public class Employee {
	private Integer eid;
	private String ename;

	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Optional<Integer> getEmpId() {
		return Optional.ofNullable(eid);
	}

	public Optional<String> getEmpName(){
		return Optional.ofNullable(ename);
	}

}


