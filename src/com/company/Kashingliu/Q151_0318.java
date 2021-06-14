package com.company.Kashingliu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q151_0318 {
    public String reverseWords(String s) {
        if (s.equals(" ")) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        Deque<String> res = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ' && !temp.toString().equals("")) {
                res.push(temp.toString());
                temp = new StringBuilder();
            } else if (s.charAt(i) == ' ' && temp.toString().equals("")) {
                continue;
            } else {
                temp.append(s.charAt(i));
            }
        }
        String prefix = temp.length() == 0 ? res.pop() : temp.toString();
        StringBuilder result = new StringBuilder(prefix);
        while (!res.isEmpty()) {
            result.append(" " + res.pop());
        }
        return result.toString();
    }
}
