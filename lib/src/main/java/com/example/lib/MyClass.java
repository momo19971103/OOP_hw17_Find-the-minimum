package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�ƦrA");
        int A = scanner.nextInt();
        System.out.println("�п�J�ƦrB");
        int B = scanner.nextInt();
        System.out.println("�п�J�ƦrC");
        int C = scanner.nextInt();
        System.out.println("�п�J�ƦrD");
        int D = scanner.nextInt();
        System.out.println("�п�J�ƦrE");
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("�̤p�Ȭ�"+MIN);


    }

}
