package com.company.Kashingliu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q316_0428 {
    public String removeDuplicateLetters(String s) {
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            nums[s.charAt(i) - 'a']++;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            if (stack.isEmpty()) {
                stack.addLast(s.charAt(i));
                nums[s.charAt(i) - 'a']--;
                continue;
            }
            char cur = s.charAt(i);
            char top = stack.peekLast();
            if (stack.contains(cur)) {
                continue;
            }
            while (cur < top && nums[top - 'a'] != 0) {
                stack.removeLast();
                top = stack.peekLast();
            }
            stack.addLast(cur);
            nums[cur - 'a']--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.removeFirst());
        }
        return stringBuilder.toString();
    }
}
