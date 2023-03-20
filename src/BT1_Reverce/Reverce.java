package BT1_Reverce;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverce {
    public static void ReverceNumber(){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackReverce = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " : " );
            int a = input.nextInt();
            stack.push(a);
        }
        System.out.println("Mảng ban đầu là : " + stack);

        for (int i = 0; i < n; i++) {
            int b = stack.pop();
            stackReverce.push(b);
        }
        System.out.println("Mảng sau khi đảo ngược là : " + stackReverce);

    }

    public static void Reverce1Sring() {
        Stack<String> stack = new Stack<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi ký tự : ");
        String inputValue = input.nextLine();
        String[]  arr = inputValue.split("");
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
           stack.push(arr[i]);
        }

        String reverceString = "";
        for (int i = 0; i < arr.length; i++) {
            String b = stack.pop();
            reverceString += b;
        }
        System.out.println("Sau khi đảo ngược : " + reverceString);

    }
}
