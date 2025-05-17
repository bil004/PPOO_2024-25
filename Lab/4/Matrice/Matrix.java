package Matrice;

public class Matrix {
    private int a[][];
    private int m, n;

    public Matrix (int m, int n) {
        assert(m > 0 && n > 0);
        this.m = m;
        this.n = n;
        a = new int[m][n];
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int get(int i, int j) {
        assert (i >= 0 && j >= 0);
        assert (i <= m-1 && j <= n-1);

        return a[i][j];
    }

    public void set(int i, int j, int e) {
        assert (i >= 0 && j >= 0);
        assert (i <= m-1 && j <= n-1);

        a[i][j] = e;
    }

    public Matrix add(Matrix a2) {
        assert (a2 != null && a2.getM() > 0 && a2.getN() > 0);
        assert (this.m == a2.getM() && this.n == a2.getN());

        Matrix res = new Matrix(m, n);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res.set(i, j, a[i][j] + a2.get(i, j));
            }
        }

        return res;
    }

    public Matrix mul(Matrix a2) {
        assert (a2 != null && a2.getM() > 0 && a2.getN() > 0);
        assert (this.m == a2.getM() && this.n == a2.getN());

        Matrix res = new Matrix(m, n);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res.set(i, j, a[i][j] * a2.get(i, j));
            }
        }

        return res;
    }

    public Matrix pow(int n) {
        Matrix res = new Matrix(m, this.n);
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res.set(i, j, (int) Math.pow(a[i][j], n));
            }
        }

        return res;
    }

    public void printMatrix() {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("[" + a[i][j] +"]");
            }
            System.out.println("");
        }
    }
}