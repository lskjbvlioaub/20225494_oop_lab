package hust.soict.dsai.lab01;

import java.util.*;
public class answer6_4 {
    public static void main(String[] args){
        String month;
        int year = -1,result =0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a valid year: ");
            year = sc.nextInt();
            if(year>0){
            } else {
                    result = 0;
                    System.out.println("Year must greater than 0. Try again!");
                    continue;
                }
            sc.nextLine(); // consume the newline character
            System.out.print("Enter a valid month: ");
            month = sc.nextLine();
            switch(month){
                case "jan":
                case "jan.":
                case "january":
                case "1": 
                    result = 31;
                    break;
                case "feb":
                case "feb.":
                case "febuary":
                case "2":
                    result = 28;
                    break;
                case "mar":
                case "mar.":
                case "march":
                case "3":
                    result = 31;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    result = 30;
                    break;
                case "may":
                case "5":
                case "may.":
                    result = 31;
                    break;
                case "6":
                case "jun":
                case "jun.":
                case "june":
                    result = 30;
                    break;
                case "7":
                case "july":
                case "jul.":
                case "jul":
                    result = 31;
                    break;
                case "8":
                case "aug":
                case "aug.":
                case "august":
                    result = 31;
                    break;
                case "9":
                case "sep":
                case "sep.":
                case "september":
                    result = 30;
                    break;
                case "10":
                case "oct":
                case "oct.":
                case "october":
                    result = 31;
                    break;
                case "nov":
                case "nov.":
                case "november":
                case "11":
                    result = 30;
                    break;
                case "dec":
                case "dec.":
                case "december":
                case "12":
                    result = 31;
                    break;
                default:
                    System.out.println("Invalid month. Try again!");
                    continue;
            }
            break;
        }
        sc.close();
        
        if((result!=28)){
            System.out.printf("Number of days in the above time is: %d", result);
        } else if(year%4==0){
            if((year%100)!=0){
                System.out.printf("Number of days in the above time is: %d", 29);
            } else if((year%400)==0){
                System.out.printf("Number of days in the above time is: %d", 29);
            } else {
                System.out.printf("Number of days in the above time is: %d", 28);
            }
        } else {
            System.out.printf("Number of days in the above time is: %d", 28);
        }
    }
}
