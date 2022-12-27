package AbsAndIntrface;

public class IIM extends UGC {

	@Override
	public void classroom() {
		// TODO Auto-generated method stub
		System.out.println("This is classroom");

	}

	@Override
	public void playground() {
		// TODO Auto-generated method stub
		System.out.println("This is Playgrount");

	}

	@Override
	public void library() {
		// TODO Auto-generated method stub
		System.out.println("This is library");

	}

	@Override
	public void canteen() {
		// TODO Auto-generated method stub
		System.out.println("This is canteen");

	}

	public void MBAstarted() {
		classroom();
		playground();
		library();
		canteen();
		System.out.println("This is MBA class");

	}

}
