package twoPointers;

import java.util.ArrayList;
import java.util.regex.Pattern;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("шалаш"));
    }

    public static boolean isPalindrome(String string) {
        ArrayList<Character> characterList = new ArrayList<>();

        for (char code : string.toLowerCase().toCharArray()) {
            if ((code >= 48 && code <= 57) || (code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                characterList.add(code);
            }
        }

        for (int startPointer = 0, endPointer = characterList.size() - 1;
             startPointer < characterList.size() / 2;
             startPointer++, endPointer--) {
            if (characterList.get(startPointer) != characterList.get(endPointer)) {
                return false;
            }
        }

        return true;
    }
}
