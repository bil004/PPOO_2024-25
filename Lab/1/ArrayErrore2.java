/*public class ArrayErrore2 {
	public static void main(String[] args) {
		int[] numeri;
		numeri[0] = 3;
	}
}*/

// FIXED
public class ArrayErrore2 {
	final static int DIM = 1;
	public static void main(String[] args) {
		int[] numeri = new int[DIM];
		numeri[0] = 3;
	}
}
