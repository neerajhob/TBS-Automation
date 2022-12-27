package HOBOLD.Learning;

class Parrent2 {
	// its overrrinding

	void show() {
		System.out.println("P: Show");
	}

	void display() {
		System.out.println("P: display");
	}
}

class child2 extends Parrent2 {
	void insert() {
		System.out.println("C: insert");
	}

	void show2() {
		System.out.println("C: Show2");
	}
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//child2 obj= new child2();
//obj.show();
//obj.display();
//obj.insert();
//Parrent2 obj2= new child2();
//obj2.show();
//obj2.display();
////obj2.insert();

//Parrent2 obj3= new Parrent2();
//obj3.show();
//obj3.display();
//obj3.insert();

		Parrent2 obj6 = (Parrent2) new child2();
		obj6.show();
		obj6.display();
//obj6.insert();
	}

}
