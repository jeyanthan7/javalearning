package basic;

import java.util.Scanner;

public class factorial {

    static int temp = 1;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number to get factorial number");
        int num = keyboard.nextInt();
        int result = fact(num);
        System.out.println("Factorial result is " + result);

    }

    public static int fact(int num) {
        for (int i = 1; i <= num; i++) {
            temp = temp * i;
        }
        return temp;
    }
}
