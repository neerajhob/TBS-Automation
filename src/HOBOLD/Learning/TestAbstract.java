package HOBOLD.Learning;

public class TestAbstract extends EmpAbstract {

	public static void main(String[] args) {
		// EmpAbstract objempabs=new EmpAbstract();
		TestAbstract objempabs = new TestAbstract();
		objempabs.show();
		objempabs.display();
		int i = objempabs.insert();
		System.out.println(i);
	}

	@Override
	public void display() {
		System.out.println("This is display");
	}

	@Override
	public int insert() {

		return 100;
	}

}
