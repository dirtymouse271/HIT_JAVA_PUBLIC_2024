    import java.util.Scanner;
    public class bai2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                n = sc.nextInt();
            } while(n>Math.pow(10, 4));
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();

            }
            for (int i = 1; i < n; i++){
                if(i%2 != 0 && i < n-1){
                    a[i] = a[i] + Math.abs(a[i-1]-a[i+1]);
                }
                if(i == n-1 && i%2 != 0){
                    a[i] = a[i] + a[i-1];
                }
            }
            for (int i = 0; i < n; i++){
                System.out.print(a[i]+" ");
            }

        }
    }
