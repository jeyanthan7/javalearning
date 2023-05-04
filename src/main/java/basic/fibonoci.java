package basic;

import java.util.Scanner;

public class fibonoci {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number to get fibonoci");
        int num = keyboard.nextInt();
        fibo(num);
    }

    public static void fibo(int num) {
        int tmp = 0;
        int tmp1 = 1;
        System.out.println("Fibonoci series for the number" + num + "is");
        System.out.println(tmp);
        System.out.println(tmp1);
        for (int i = 3; i <= num; i++) {
            int temp = tmp + tmp1;
            System.out.println(temp);
            tmp = tmp1;
            tmp1 = temp;
        }

    }

}
