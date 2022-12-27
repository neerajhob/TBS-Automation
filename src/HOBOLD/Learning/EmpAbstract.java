package HOBOLD.Learning;

public abstract class EmpAbstract {
	// abstract will be used only with extent.
	// Final will not allow to access the class.
	public abstract void display();

	public abstract int insert();

	void show() {
		System.out.println("This is Empabstract");

//EmpAbstract objfinal1=new EmpAbstract();
//objfinal1.show();
	}
}
