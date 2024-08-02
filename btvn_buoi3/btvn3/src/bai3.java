import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static boolean kiemtra(int a, int b, int c, String d){
        Scanner sc = new Scanner(System.in);
        if ((a+b ==c) && d.equals("Y")){
            return true;
        }
        if ((a+b !=c) && d.equals("N")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[2];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            array1[i] = random.nextInt(10);
        }
        int[] array2 = new int[1];
        for (int i = 0; i < 1; i++) {
            array2[i] = random.nextInt(20);
        }
        System.out.print(array1[0]);
        System.out.print("+");
        System.out.print(array1[1]);
        System.out.print("=");
        System.out.println(array2[0]);
        String d = sc.nextLine();
        if(kiemtra(array1[0],array1[1],array2[0],d)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
