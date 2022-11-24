package workout1;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to be converted to ASCII value");
        char ch = input.next().charAt(0);
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}