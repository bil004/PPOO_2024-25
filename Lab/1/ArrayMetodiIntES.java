public class ArrayMetodiIntES {

	static int lunghezza(int[] a) {
		return a.length;
	}

	static void stampare(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.println("element " + i + " = " + a[i]);
	}

	static int somma(int[] a) {
		int sommaAttuale = 0;
		for (int i = 0; i < a.length; i++)
			sommaAttuale = sommaAttuale + a[i];
		return sommaAttuale;
	}

	static boolean confrontoDue(int[] a, int[] b) {
		boolean confronto = (a.length == b.length);
		int i = 0;
		while (i < a.length && confronto) {
			confronto = (a[i] == b[i]);
			i++;
		}
		return confronto;
	}

	static boolean isThere(int[] a, int e) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e)
				return true;
		}
		return false;
	}

	static int maxElement(int[] a) {
		if (a == null)
			return -1;
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 }, e = 10;

		System.out.println("lunghezza array = " + lunghezza(a));
		System.out.println("elementi: ");
		stampare(a);
		System.out.println("somma complessiva = " + somma(a));
		int b[] = { 10, 20, 30 };
		System.out.println(confrontoDue(a, b) ? "array uguali" : "array diversi");
		System.out.println("L'elemento " + e + " e' presente? " + isThere(a, e));
		System.out.println("Max = " + maxElement(a));
	}
}
