package com.allensarmiento.codingquestions.util;

// Replace all spaces in a string with '%20'. The string has sufficient space
// the end to hold the additional characters, and you are given the "true"
// length of the string.
public class URLify {
    public static String replaceSpaces(String str, int endPosition) {
        char[] ch = str.toCharArray();

        int characterPointer = ch.length - 1;
        int i = endPosition - 1;

        while (i >= 0 && characterPointer >= 0) {
            if (ch[i] != ' ') {
                ch[characterPointer] = ch[i];
                characterPointer--;
            } else {
                ch[characterPointer] = '0';
                ch[characterPointer - 1] = '2';
                ch[characterPointer - 2] = '%';
                characterPointer -= 3;
            }
            i--;
        }

        return new String(ch);
    }
}
