package HOBOLD.Learning;

class Parrent {
	void show() {
		System.out.println("P: Show");
	}

	void display() {
		System.out.println("P: display");
	}
}

class child extends Parrent {
	void insert() {
		System.out.println("C: insert");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
		obj.display();
		obj.show();
		obj.insert();

//		Parrent obj1= new Parrent();
//		obj1.display();
//		obj1.show();

	}

}
