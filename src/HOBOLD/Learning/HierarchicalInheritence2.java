package HOBOLD.Learning;

class Parrents {
	void show() {
		System.out.println("P: Show");
	}

	void display() {
		System.out.println("P: display");
	}
}

class children1 extends Parrents {
	void insert() {
		System.out.println("C: insert");
	}
}

class children2 extends Parrents {

}

class children3 extends Parrents {

}

public class HierarchicalInheritence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		children1 obj = new children1();
		obj.display();
		obj.show();
		obj.insert();

		Parrents obj1 = new Parrents();
		obj1.display();
		obj1.show();

		children1 obj2 = new children1();
		obj2.display();
		obj2.show();
	}

}
