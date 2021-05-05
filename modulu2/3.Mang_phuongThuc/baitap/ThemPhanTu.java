package baitap;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int []arr1=new int[6];
        for (int i=0;i<arr1.length;i++){
           if(i<arr.length){
               arr1[i]=arr[i];
           }else {
               arr1[i]=6;
           }
        }
        for (int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+"");
        }
    }
}
