package hust.soict.dsai.lab01;

import java.util.*;
public class answer6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];
        System.out.println("Enter the elements of m1:");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of m2:");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        sc.close();;
        int[][] result = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The result is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
