package baitap;

public class SoNguyenTo100 {
    public static void main(String[] args) {
         for (int j=2;j<100;j++){
             if (checkPrime(j)==true){
                 System.out.print(j+",");
             }
         }
    }
    public static boolean checkPrime(int number){
        boolean check=true;
        for (int i=2; i<=Math.sqrt(number); i++){
            if (number%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
}
