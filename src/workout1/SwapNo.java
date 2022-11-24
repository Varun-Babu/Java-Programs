package workout1;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = input.nextInt();
        System.out.println("Enter the second number");
        int y = input.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping(without temp):"
                    + " x = " + x + ", y = " + y);

        int temp =x;
        x = y;
        y = temp;

        System.out.println("After swapping(with temp):"
                + " x = " + x + ", y = " + y);

        }
    }

