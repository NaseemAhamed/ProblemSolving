import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7};
        int order = 2;
        Arrays.stream(rotateArray(a, order)).forEach(System.out::println);
    }

    // divide by length-order
    // reverse first (order to l-o)
    // reverse second (l-o to length)
    // reverse whole array

    public static int[] rotateArray(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            return arr;
        }
        if (order > arr.length) {
            order = order % arr.length;
        }
        order = arr.length - order;

        reverse(arr, 0, order - 1);
        reverse(arr, order, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) {
            return;
        }
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
