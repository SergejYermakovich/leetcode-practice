package hashmap;

import java.util.HashMap;
import java.util.Map;

/*
* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
* */
public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct2("a", "b"));
        System.out.println(canConstruct2("aa", "ab"));
        System.out.println(canConstruct2("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> magazineSymbolsMap = new HashMap<>();
        for (char symbol : magazine.toCharArray()) {
            magazineSymbolsMap.put(
                    symbol, magazineSymbolsMap.get(symbol) == null ? 1 : magazineSymbolsMap.get(symbol) + 1
            );
        }

        for (char symbol : ransomNote.toCharArray()) {
            magazineSymbolsMap.put(
                    symbol, magazineSymbolsMap.get(symbol) == null ? -1 : magazineSymbolsMap.get(symbol) - 1
            );
        }

        for (Map.Entry<Character, Integer> entry : magazineSymbolsMap.entrySet()) {
            if (entry.getValue() < 0) return false;
        }

        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] chars = new int[200];
        for (char symbol : magazine.toCharArray()) {
            chars[symbol]++;
        }

        for (char symbol : ransomNote.toCharArray()) {
            chars[symbol]--;
            if (chars[symbol] < 0) return false;
        }
        return true;
    }
}
