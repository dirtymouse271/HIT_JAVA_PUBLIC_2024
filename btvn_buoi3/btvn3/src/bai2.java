import java.util.Scanner;
public class bai2 {
    public static boolean kiemtra(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (kiemtra(s)) {
            System.out.println(s.toUpperCase());
        }
        else {
            System.out.println(s.toLowerCase());
        }
    }
}
