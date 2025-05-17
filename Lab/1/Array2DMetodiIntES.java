public class Array2DMetodiIntES {

	static int numeroRighe(int[][] a) {
		return a.length;
	}

	static int numeroColonne(int[][] a) {
		return a[0].length;
	}

	static void stampare(int[][] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				System.out.println("elemento di riga " + i + ", colonna " + j + " = " + a[i][j]);
	}

	static int somma(int[][] a) {
		int sommaAttuale = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				sommaAttuale = sommaAttuale + a[i][j];
		return sommaAttuale;
	}

	static boolean confronto(int[][] a, int[][] b) {
		boolean confronto = (a.length == b.length) && (a[0].length == b[0].length);
		int i = 0;
		int j = 0;
		while (i < a.length && confronto) {
			while (j < a[i].length && confronto) {
				confronto = (a[i][j] == b[i][j]);
				j++;
			}
			j = 0;
			i++;
		}
		return confronto;
	}

	static boolean isThere(int[][] a, int e) {
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (a[i][j] == e)
					return true;
			}
		}
		return false;
	}

	static int maxElement(int[][] a) {
		if (a == null) return -1;
		int max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) max = a[i][j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println("numero di colonne = " + numeroColonne(a));
		System.out.println("numero di righe = " + numeroRighe(a));
		System.out.println("elementi: ");
		stampare(a);
		System.out.println("somma complessiva = " + somma(a));
		int b[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(confronto(a, b) ? "uguali" : "diversi");
		int c[][] = { { 10, 20, 30 }, { 40, 40, 60 } };
		System.out.println(confronto(a, c) ? "uguali" : "diversi");

		int n = 20;
		System.out.println("n presente in a? " + isThere(a, n));
		System.out.println("Max = " + maxElement(a));

	}
}
