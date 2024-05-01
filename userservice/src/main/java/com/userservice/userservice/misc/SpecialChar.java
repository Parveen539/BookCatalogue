package com.userservice.userservice.misc;

public class SpecialChar {
    public static void main(String[] args) {
        String str1 = "Check#@String!";
        int count = 0;
        String str2 = "";

        for (int i=0; i<str1.length(); i++) {
            if (!Character.isDigit(str1.charAt(i)) &&
                    !Character.isLetter(str1.charAt(i)) &&
            !Character.isWhitespace(str1.charAt(i))) {
                count++;
            } else {
                str2 = str2 + str1.charAt(i);
            }
        }

        /*if (count == 0 ) {
            System.out.println("There is no special character!!");
        } else {
            System.out.println("There is special character count " + count);
        }*/

        System.out.println("Updated String is " + str2);
    }
}
