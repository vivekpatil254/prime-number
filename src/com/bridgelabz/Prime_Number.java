package com.bridgelabz;
import java.util.Scanner;


public class Prime_Number {

    public static void main(String[] args) {
        int flag=0,number,i;
        System.out.println("Enter the Number : ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for(i=2;i<number;i++) {
            if (number%i==0)
                flag=1;
        }
        if(flag==0)
            System.out.print("Entered number is a prime number");
        else
            System.out.print("Entered number is not a prime number");
    }
}