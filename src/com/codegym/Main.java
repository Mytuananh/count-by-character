package com.codegym;

public class Main {

    public static void main(String[] args) {
	int a = countByCharacter("mocconbo", 'c');
        System.out.println(a);
    }
    public static int countByCharacter(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a == character) {
                count++;
            }
        }
        return count;
    }
}
