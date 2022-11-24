package workout1;

import java.util.Scanner;

public class LargestNo {
    public static int largeOrNot(int i,int j, int k){
        int a = Math.max(i,j);
        int b = Math.max(a,k);
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println("Enter the third number");
        int num3 = input.nextInt();
        int large = largeOrNot(num1,num2,num3);
        System.out.println("Largest no is: "+ large);

        int large2 = num3 > (num1>num2 ? num1:num2) ? num3:((num1>num2) ? num1:num2);
        System.out.println("Largest no is (single line): "+ large2);
    }
}
