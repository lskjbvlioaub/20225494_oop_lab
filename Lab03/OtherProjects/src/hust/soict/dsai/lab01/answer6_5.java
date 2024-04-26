package hust.soict.dsai.lab01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class answer6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int leng = sc.nextInt();
        int[] arr = new int[leng];
        
        for(int i = 0; i < leng; i++){
            System.out.printf("Enter element %d: ", i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        Arrays.sort(arr);
        
        for(int j = 0; j < leng; j++){
            sum += arr[j];
        }
        double average = ((double) sum /leng);
        System.out.printf("The sum is %d\nThe average value is %.2f\nThe sorted array is %s",sum,average,Arrays.toString(arr));

    }
}
