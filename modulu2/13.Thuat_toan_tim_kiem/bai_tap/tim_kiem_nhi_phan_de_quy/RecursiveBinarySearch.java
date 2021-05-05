package bai_tap.tim_kiem_nhi_phan_de_quy;

public class RecursiveBinarySearch {
    static int recursiveBinarySearch(int[] arr, int l, int r, int num) {
        int mid = (l + r) / 2;
        if (r >= l) {
            if (arr[mid] == num) {
                return mid;
            }else if (num < arr[mid]) {
                return recursiveBinarySearch(arr, l, mid - 1, num);
            } else {

                return recursiveBinarySearch(arr, mid + 1, r, num);
            }
        }
      return -1;
        }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(recursiveBinarySearch(list, 0, list.length - 1, 3));
    }
}
