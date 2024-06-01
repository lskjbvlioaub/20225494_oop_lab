package hust.soict.dsai.lab01;

import java.util.Scanner;
import java.lang.*;
public class answer6_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.printf("Enter integer n: ");
            n = sc.nextInt();
            if(n<=0){
                System.out.print("N must greater than 0. Try again\n");
            }
        }while(n<=0);
        
    String symbol = "*";
    String space = "";
    for(int j = 0; j<(n-1);j++){
        space += " ";
    }
    for(int i = 0; i < n; i++){
        System.out.print(space.substring(i));
        System.out.println(symbol);
        symbol += "**";
    }
    }
}
