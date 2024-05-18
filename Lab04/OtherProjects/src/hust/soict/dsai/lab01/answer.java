package hust.soict.dsai.lab01;

import java.util.Scanner;

public class answer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers a, b respectively (b is the divisor)");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("The sum is: %f\nThe difference is: %f\nThe product is: "
        		+ "%f\nThe quotient is: %f",(a+b),(a-b),(a*b),(a/b));
        sc.close();
    }
}
