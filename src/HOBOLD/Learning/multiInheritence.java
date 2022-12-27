package HOBOLD.Learning;

class GrandParrent

{
	void delete() {
		System.out.println("P: Delete");
	}

}

class Parrent1 extends GrandParrent {
	void show() {
		System.out.println("P: Show");
	}

	void display() {
		System.out.println("P: display");
	}
}

class child1 extends Parrent1 {
	void insert() {
		System.out.println("C: insert");
	}
}

public class multiInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 obj = new child1();
		obj.display();
		obj.show();
		obj.insert();
		obj.delete();

		Parrent1 obj1 = new Parrent1();
		obj1.display();
		obj1.show();
		obj1.delete();

	}

}
