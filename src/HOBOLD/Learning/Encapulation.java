package HOBOLD.Learning;
//

//access modifire
//private 
//default
//protected
//public

class demo1 {
	public void show() {
		System.out.println("Demo1: show");
	}
}

class demo2 extends demo1 {
	public void show() {
		System.out.println("Demo2: show");
	}
}

public class Encapulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 obj = new demo2();

		obj.show();
	}

}
