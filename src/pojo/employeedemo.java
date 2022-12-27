/**
 * 
 */
package pojo;

/**
 * @author neeraj.yadav
 *
 */
public class employeedemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str= new String("Neeraj Yadav");
//		
//		System.out.println(str);

		// employee objemp=new employee(100,"Neeraj",100000,202);
		employee objemp = new employee();
		objemp.setEmployeeid(100);
		objemp.setEmployeename("Neeraj Yadav");
		objemp.setEmployeesalary(100000);
		objemp.setManagercode(102);
//System.out.println(objemp);
//alt+shift=r
		employee objemp1 = new employee();
		objemp1.setEmployeeid(102);
		objemp1.setEmployeename("Dimple Yadav");
		objemp1.setEmployeesalary(50000);
		objemp1.setManagercode(102);
//System.out.println(objemp1);
		employee[] employees = new employee[2];
		employees[0] = objemp;
		employees[1] = objemp1;
		for (employee obj : employees) {
			System.out.println(obj.getEmployeeid() + "\t" + obj.getEmployeename() + "\t" + obj.getEmployeesalary()
					+ "\t" + obj.getManagercode());
			;
		}

	}

}
