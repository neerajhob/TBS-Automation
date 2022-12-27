package HOBOLD.Learning;

public class Emptestinterface implements empInterface {

	public static void main(String[] args) {
		Emptestinterface objempinterface = new Emptestinterface();
		objempinterface.show();
		objempinterface.display();
		objempinterface.insert();
		// System.out.println(objempinterface.age);
	}

	@Override
	public void show() {
		System.out.println("This is show 1");

	}

	@Override
	public void display() {
		System.out.println("This is display ");

	}

	@Override
	public void insert() {
		System.out.println("This is insert ");

	}

}
