package AbsAndIntrface;

abstract class test {
	public test() // constructor
	{
		System.out.println("constroctor : test ");
	}

	public test(int a, int b) {
		this(); // using this we can call multiple constructor
		System.out.println("Contructor a+b=" + (a + b));
	}

	abstract void show();

	public void display() {
		System.out.println("This is display");
	}
}

public class abstraction extends test {

	public abstraction()

	{
		super(20, 25);
		// super();
		System.out.println("constructor : abstraction ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction obj = new abstraction();
		obj.display();
		obj.show();
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("This is show");
	}

}
