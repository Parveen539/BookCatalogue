package com.userservice.userservice.misc;

public class RotationalString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CEAB";

        if (isRotate(str1, str2)) {
            System.out.println("Strings are rotational!!");
        } else {
            System.out.println("Strings are not rotational!!");
        }
    }

    public static boolean isRotate(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
}
