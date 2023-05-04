package basic;

import java.util.Scanner;
import java.io.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome");
        String str = keyboard.next();
        boolean result = palindromeCheck(str);
        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static boolean palindromeCheck(String str) {
        boolean bool = false;
        int len = str.length();
        String[] sStr = str.split("");
        String[] rsStr = str.split("");

        for (int i = 0, j = len - 1; i < len; i++, j--) {
            if (sStr[i].equals(rsStr[j])) {
                bool = true;
            } else {
                bool = false;
            }
        }
        return bool;
    }
}
