import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int countt = 0;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
            for(int j = 0; j< str.length; j++) {
                if(str[0].equals(" ") && str[1].equals(" ")){
                    countt++;
                }
                else if (!str[j].equals(" ") && str[j+1].equals(" ")) {
                    countt++;
                }
            }
            System.out.println(countt);
        }
    }
}

