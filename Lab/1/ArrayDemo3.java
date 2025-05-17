public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 1;
        }
        for (int num : numeri) {
            System.out.println(num);
        }
    }
}
