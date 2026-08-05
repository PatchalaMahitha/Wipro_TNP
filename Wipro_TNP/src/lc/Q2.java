package lc;

public class Q2 {
	public static void main(String args[]) {
		int x=10;
		int y=20;
		int z=30;
		int temp1=x;
		x=z;
		z=y;
		y=temp1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
