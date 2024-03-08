package org.example;

public class PalindromCheck {

    public static boolean isPalindrom(String str) {
        int uzunluk = str.length();

        StringBuilder tersMetin = new StringBuilder();
        for (int i = uzunluk - 1; i >= 0; i--) {
            tersMetin.append(str.charAt(i));
        }

        return str.equals(tersMetin.toString());
    }

    public static void main(String[] args) {
        String metin = "JavaJ";

        if (isPalindrom(metin)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom Değil");
        }
    }
}