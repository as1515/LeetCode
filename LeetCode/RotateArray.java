import java.util.Arrays;

public class RotateArray {
    int[] array;

    public int[] solution(int[] array, int k) {
        this.array = array;
        k %= array.length;
        // loop(array.length, k, 0);
        // loop(k, k, 0);
        // loop(array.length + k, k, k);
        reverse(0, array.length - 1);
        reverse(0, k - 1);
        reverse(k, array.length - 1);
        return array;
    }

    private void loop(int n, int k, int j) {
        System.out.println("n " + n + " k " + k);
        int t;
        for (int i = j; i < (n) / 2; i++) {
            t = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = t;
        }
    }

    private void reverse(int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        RotateArray rotate = new RotateArray();
        rotate.solution(array, 3);
        System.out.println(Arrays.toString(array));
    }
}

// int[] array = { 1, 2, 3, 4, 5, 6, 7 };
// int k = 3;
// int t;
// for (int i = 0; i < array.length / 2; i++) {
// t = array[i];
// array[i] = array[array.length - i - 1];
// array[array.length - i - 1] = t;
// }

// for (int i = 0; i < k / 2; i++) {
// t = array[i];
// array[i] = array[k - i - 1];
// array[k - i - 1] = t;
// }

// for (int i = k; i < (array.length + k) / 2; i++) {
// System.out.println("k " + k + " i " + i + "array.length - 1 + k / 2 " +
// ((array.length + k) / 2));
// t = array[i];
// System.out.println("t " + t);
// array[i] = array[array.length - 1 + k - i];
// System.out.println("array[i] " + array[i]);
// array[array.length - 1 + k - i] = t;
// System.out.println("array[array.length - 1 + k - i] " + array[array.length -
// 1 + k - i]);
// System.out.println(Arrays.toString(array));
// }