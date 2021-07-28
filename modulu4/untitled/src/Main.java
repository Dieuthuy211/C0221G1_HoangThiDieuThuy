import com.sun.javaws.IconUtil;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    //    public static int[] kiemTra(int[][] arr) {
//        int max =0;
//        int[] arr1 = new int[4];
//        for (int i = 0; i < 4; i++) {
//
//            for (int j = 0; j < 4; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//            arr1[i] = max;
//            max=0;
//        }
//        return arr1;
//    }
    public static String[] find(String string) {
        String[] arr = string.split("");
        String[] arr1 = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (string.indexOf(arr[i]) == 1) {
                arr[i]=arr1[i];
            }

        }


            return arr1;
    }

    public static void main(String[] args) {
//        int[][] arr ={{3, 4, 1, 8},
//                {1, 4, 9, 11},
//                {76, 34, 21, 1},
//                {12, 16, 17, 10}};
//
//
//        int[] arr1 = kiemTra(arr);
//        System.out.println(Arrays.toString(arr1));

        String s = "adgsafdwtqsa";
        String[] arr = find(s);
        System.out.println(Arrays.toString(arr));
    }
}
