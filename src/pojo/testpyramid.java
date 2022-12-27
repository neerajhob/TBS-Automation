package pojo;

public class testpyramid {

	public static void main(String[] args) {
		int rows = 10;
		int n = 18;
		System.out.println("Table of : " + n);
		for (int i = 1; i <= rows; i++) {
			// for (int j = i +1; j <= i; ++j)

			System.out.print(n + "*" + i + "=" + i * n + " ");

			System.out.println();
		}
	}

}
