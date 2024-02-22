package javaPrograms;

import java.util.Scanner;

import java.util.Scanner;

public class PrintMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Input the integer
        
        System.out.print("Enter the number of multiples to print: ");
        int n = scanner.nextInt(); // Input the number of multiples
        
        System.out.println("The first " + n + " multiples of " + num + " are:");
                           //5
        for (int i = 1; i <= n; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }                      // (5+1)+(5*1)
        
        scanner.close();
        for(int i=1;i<=n;i++) {
        	System.out.println(num*i);
        }
    }
}
