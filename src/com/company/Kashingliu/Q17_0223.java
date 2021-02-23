package com.company.Kashingliu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_0223 {
    static class Solution {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        static List<String> combinations = new ArrayList<>();
        public void divide(StringBuilder temp, String numbers, int index) {
            System.out.println(temp.toString());
            if (index == numbers.length()) {
                combinations.add(temp.toString());
                return;
            }
            char current = numbers.charAt(index);
            String code = phoneMap.get(current);
            for (int i = 0; i < code.length(); ++i) {
                temp.append(code.charAt(i));
                divide(temp, numbers, index+1);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
        public List<String> main(String numbers) {
            divide(new StringBuilder(), numbers, 0);
            System.out.println(combinations.toString());
            return combinations;
        }
    }
}