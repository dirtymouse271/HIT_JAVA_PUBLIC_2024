import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if (type.equals("Square")) {
            int a = Integer.parseInt(sc.nextLine());
            System.out.println(Math.pow(a, 2));
        }
        if (type.equals("Triangle")) {
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            int c = Integer.parseInt(sc.nextLine());
            if (a+b>c && a+c>b && b+c>a) {
                System.out.println(Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4);
            }
            else{
                System.out.println("-1");
            }
        }
        if (type.equals("Circle")) {
            int r = Integer.parseInt(sc.nextLine());
            System.out.println(Math.PI*Math.pow(r, 2));
        }
    }
}
