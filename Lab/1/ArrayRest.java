public class ArrayRest {

    public static int[] RestituisceArray() {
        return new int[] { 10, 20, 30 };
    }

    static void stampare(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("elemento " + i + " = " + a[i]);
    }

    public static void main(String[] args) {
        stampare(RestituisceArray());
    }
}
