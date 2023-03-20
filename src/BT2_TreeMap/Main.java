package BT2_TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự : ");
        String a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char character = Character.toUpperCase(a.charAt(i));
            Integer checkValue = treeMap.get(character);
            if (checkValue==null){
                treeMap.put(character,1);
                continue;
            }
            treeMap.put(character,++checkValue);
        }
        System.out.println("Chuỗi ban đầu : " + a);
        System.out.println("Số lần lặp lai của các kí tự " + treeMap);
    }
}
