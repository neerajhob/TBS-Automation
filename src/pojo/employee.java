package pojo;

public class employee {
	private int employeeid;
	private String employeename;
	private double employeesalary;
	private int managercode;

	public employee() {
	}

	/**
	 * selectafter employee
	 * 
	 * @param employeeid
	 * @param employeename
	 * @param employeesalary
	 * @param managercode
	 */
	public employee(int employeeid, String employeename, double employeesalary, int managercode) {
		this.employeeid = employeeid;
		this.employeename = "Mr.." + employeename;
		this.employeesalary = employeesalary;
		this.managercode = managercode;
	}

	/**
	 * /**last employee
	 * 
	 * @return the employeeid
	 */
	public int getEmployeeid() {
		return employeeid;
	}

	/**
	 * @param employeeid the employeeid to set
	 */
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * @return the employeename
	 */
	public String getEmployeename() {
		return employeename;

	}

	/**
	 * @param employeename the employeename to set
	 */
	public void setEmployeename(String employeename) {
		this.employeename = "Mr." + employeename;

	}

	/**
	 * @return the employeesalary
	 */
	public double getEmployeesalary() {
		return employeesalary;
	}

	/**
	 * @param employeesalary the employeesalary to set
	 */
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	/**
	 * @return the managercode
	 */
	public int getManagercode() {
		return managercode;
	}

	/**
	 * @param managercode the managercode to set
	 */
	public void setManagercode(int managercode) {
		this.managercode = managercode;
	}

	@Override
	public String toString() {
		return "employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", managercode=" + managercode + "]";
	}

}
