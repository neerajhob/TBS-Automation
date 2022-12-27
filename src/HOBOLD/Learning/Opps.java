package HOBOLD.Learning;

public class Opps {

	int erars = 2;
	int legs = 2;
	int hand = 2;
	String name;
	String Sirname;

	public Opps(String name, String Sirname) {
		this.name = name;
		this.Sirname = Sirname;

	}

	void walking() {
		System.out.println(name + Sirname + " is walking");
	}

	void eating() {
		System.out.println(name + Sirname + " is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opps obj = new Opps("Neeraj", "Yadav");
		obj.walking();
		obj.eating();
		System.out.println(obj.erars);
		System.out.println(obj.legs);
		Opps obj2 = new Opps("Raj", "Yadav");
		obj2.walking();
		obj2.eating();
		System.out.println(obj2.erars);
		System.out.println(obj2.legs);
	}

}
