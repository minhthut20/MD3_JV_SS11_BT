package BT4_ChangeIntoBinary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeIntoBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số : ");
        int number = input.nextInt();
        do {
            int mod = number%2;//chia lấy phần dư để
            stack.push(mod);// nhận lấy phần dư r push vào
            number = number/2;// gán lại number = phần nguyên chia cho 2 dùng cho vòng lặp tiếp theo
        }while (number!=0);// ktr đk vòng lặp dừng lại khi phép chia phần nguyên về = 0
        String str = "";
        int stackSize= stack.size();// kta kích thước stack, dungf cho vòng lặp dưới
        int temNum;
        for (int i = 0; i < stackSize; i++) {
            temNum= stack.pop();// lấy ra tựgf phần tử trong Stack
            str+=temNum;
        }
        System.out.println("Số nhị phân là: " + str);
    }
}
