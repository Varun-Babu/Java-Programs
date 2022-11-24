package workout1;

import java.util.Scanner;

public class ReverseNo {
    public static void reverse(int i){
        int rev =0;
        int rem;
        while (i != 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = input.nextInt();
        reverse(num);
    }
}
