package HOBOLD.Learning;

class Test {

	void show() {

		System.out.println("Hello Neeraj");
	}

	void show(int a) {
		System.out.println("Hello int a");

	}

	void show(String b) {
		System.out.println("Hello string b");

	}

	void show(String name, int age, double salary) {

		System.out.println("Hello string three");
	}
}

public class Neeraj {

	public static void main(String[] args) {

		Test obj = new Test();
		// obj.show();
		// obj.show(0);
		// obj.show(null);
		// overloading
		obj.show("Neeraj", 32, 100000);
	}

}
