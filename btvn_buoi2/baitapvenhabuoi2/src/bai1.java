import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        double C = 2*r*3.14;
        double S = r*r*3.14;
        String formattedC = String.format("%.3f", C);
        String formattedS = String.format("%.3f", S);
        System.out.print(formattedC+" ");
        System.out.println(formattedS);
        sc.close();
    }
}
