package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "aaabccbaaa";
        String str2 = "abccbb";
        System.out.println(palindrome(str1));
        System.out.println(palindrome(str2));
    }

    public static boolean palindrome(String str){

        boolean result = true;
        int i = 0;
        int j = str.length() - 1;
        int len = j + 1;
        char [] charArray = str.toCharArray();

        while ( i < len / 2){
            if (charArray[i] != charArray[j]){
                result = false;
                return result;
            }

            i++;
            j--;
        }
        return result;
    }
}
