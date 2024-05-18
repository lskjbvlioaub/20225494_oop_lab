package hust.soict.dsai.lab01;

import java.util.Scanner;
import java.lang.Math;
public class answer2_2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to select a type of equations:\n1. Ax+b=0\n2. Ax+By=C\n3. Ax^2+Bx+C=0\n");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.print("a = ");
                double a = sc.nextDouble();
                System.out.print("b = ");
                double b = sc.nextDouble();
                if(a==0){
                    if(b==0){
                        System.out.println("Infinitely many solutions");
                    } else {
                        System.out.println("Does not exist any solutions");
                    }
                } else {
                    System.out.printf("x = %f", -(b/a));
                }
                break;
            case 2:
                ///Read 
                System.out.print("a1 = ");
                double a1 = sc.nextDouble();
                System.out.print("b1 = ");
                double b1 = sc.nextDouble();
                System.out.print("c1 = ");
                double c1 = sc.nextDouble();
                System.out.print("a2 = ");
                double a2 = sc.nextDouble();
                System.out.print("b2 = ");
                double b2 = sc.nextDouble();
                System.out.print("c2 = ");
                double c2 = sc.nextDouble();
                double detX = b1*c2-b2*c1;
                double detY = a1*c2-a2*c1;
                double det = a1*b2-a2*b1;
                if(det == 0){
                    if((detX == 0)&&(detY == 0)){
                        System.out.println("Infinitely many solutions");
                    } else {
                        System.out.println("Does not exist any solutions");
                    }
                } else {
                    System.out.printf("x = %f\ny = %f", (detX/det),(detY/det));
                }
                break;
            case 3:
                System.out.print("a = ");
                a = sc.nextDouble();
                System.out.print("b = ");
                b = sc.nextDouble();
                System.out.print("c = ");
                
                double c = sc.nextDouble();
                double delta = b*b-4*a*c;
                if(delta > 0){
                    System.out.printf("x1 = %f\nx2 = %f\n",((-b+Math.sqrt(delta))/(2*a)),((-b-Math.sqrt(delta))/(2*a)) );
                } else if(delta == 0){
                    System.out.printf("x1 = x2 = %f\n",(-b/(2*a)) );
                } else {
                    System.out.printf("The equation has no real root\n");
                }
                break;
        }
        sc.close();
    }
}
