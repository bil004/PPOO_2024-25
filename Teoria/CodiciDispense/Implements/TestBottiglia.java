package Implements;

// Bottiglia.java
public class TestBottiglia {
	public static void main(String[] args) {
		Bottiglia a = new Bottiglia(5);
		Bottiglia b = new Bottiglia(9);
		BottigliaConTappo c = new BottigliaConTappo(10);

		System.out.println("Bottiglia: " + a);
		System.out.println("Bottiglia: " + b);
		System.out.println("\nComparo a con b:" + a.compareTo(b));
		System.out.println("Bottiglia con tappo: " + c);

		// System.out.println("Numero finale di istanze di Bottiglia: " +
		// Bottiglia.numBottiglie);
		// System.out.println("Numero finale di istanze di BottigliaConTappo: " +
		// BottigliaConTappo.numBottiglie);

	}
}