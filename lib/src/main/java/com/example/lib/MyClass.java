package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字A");
        int A = scanner.nextInt();
        System.out.println("請輸入數字B");
        int B = scanner.nextInt();
        System.out.println("請輸入數字C");
        int C = scanner.nextInt();
        System.out.println("請輸入數字D");
        int D = scanner.nextInt();
        System.out.println("請輸入數字E");
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("最小值為"+MIN);


    }

}
