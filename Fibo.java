package com.shivang;
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        int a =0;
        int b=1;
        int count =2;
        while(count<=n){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.println("Value of b is "+b);

            count++ ;
        }

        System.out.println("Count is "+count);
        System.out.println(b);

    }
}
