package baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập độ dài mang a");
        n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("nhập độ dài mang b");
        m = input.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = input.nextInt();
        }
        int[] c = new int[n + m];
        for (int z = 0; z < n; z++) {
                c[z] = a[z];
        }
        for (int v = 0; v < c.length; v++) {
            c[c.length-n] = b[v];
        }


//        int d=0;
//        while (d<n){
//            c[d]=a[d];
//            d++;
//        }
//        while (d<n+m){
//            c[d]=b[d-n];
//            d++;
//        }
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x]);
        }
    }
}
