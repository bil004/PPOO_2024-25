package BottigliaConTappo;

// Bottiglia.java
public class TestBottiglia {
	public static void main(String[] args) {
		Bottiglia b = new Bottiglia(5);
		Bottiglia b1 = new Bottiglia(9);
		BottigliaConTappo bt = new BottigliaConTappo(10);

		System.out.println("Bottiglia: " + b);
		System.out.println("Bottiglia: " + b1);
		System.out.println("Bottiglia con tappo: " + bt);

		// System.out.println("Numero finale di istanze di Bottiglia: " +
		// Bottiglia.numBottiglie);
		// System.out.println("Numero finale di istanze di BottigliaConTappo: " +
		// BottigliaConTappo.numBottiglie);

	}
}