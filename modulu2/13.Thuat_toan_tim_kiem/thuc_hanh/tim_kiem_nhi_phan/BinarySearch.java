package thuc_hanh.tim_kiem_nhi_phan;

public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

static int binarySearch(int[]arr,int num){
    int l=0;
    int r=arr.length-1;
    while (r>=l){
        int mid=(l+r)/2;
        if(num==arr[mid])return mid;
        else if(num<arr[mid]) r=mid-1;
        else l=mid+1;
    }
    return -1;
}
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
    }
}
