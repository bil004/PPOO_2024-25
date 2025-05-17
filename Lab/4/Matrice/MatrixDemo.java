package Matrice;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(5, 10), m2 = new Matrix(5, 10);
        
        for (int i = 0; i < m1.getM(); i++) {
            for (int j = 0; j < m1.getN(); j++) {
                m1.set(i, j, (int)(Math.random()* 100 + 1));
            }
        }

        for (int i = 0; i < m2.getM(); i++) {
            for (int j = 0; j < m2.getN(); j++) {
                m2.set(i, j, (int) (Math.random()* 100 + 1));
            }
        }
        System.out.println("m1:");
        m1.printMatrix();

        System.out.println("\nm2: ");
        m2.printMatrix();

        System.out.println("\nRestituisco l'elemento in posizione [2][7] di m1: " + m1.get(2, 7));
        System.out.println("Restituisco l'elemento in posizione [4][9] di m2: " + m2.get(2, 7));

        System.out.println("\nRestituisco la grandezza di m1:\nRighe = " + m1.getM() + "\tColonne = " + m1.getN());
        System.out.println("Restituisco la grandezza di m2:\nRighe = " + m2.getM() + "\tColonne = " + m2.getN());

        Matrix sum = m1.add(m2), mul = m1.mul(m2), pow = m1.pow(2);
        System.out.println("\nSomma delle 2 matrici:\n");
        sum.printMatrix();
        System.out.println("\nProdotto delle 2 matrici:\n");
        mul.printMatrix();
        System.out.println("\nRisultato della potenza di 2 su m1:\n");
        pow.printMatrix();
        System.out.println("");
    }
}