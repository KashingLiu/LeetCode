package com.company.Kashingliu;
// 当遇到一个左括号时，将当前数字和当前字符串全部入栈
// 当遇到一个数字的时候，把之前保存的数字取出来，并加上这个数字，存入multi
// 当遇到一个字符时，更新临时字符串，在字符串基础上append新字符
// 当遇到一个右括号时，弹出栈，更新临时字符串，在原有字符串基础上加上弹出的字符串，成为新的临时字符串

import java.util.Map;
import java.util.Stack;

public class Q394_0223 {
    public String decodeString(String s) {
        Stack<Integer> digits = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        StringBuilder temp = new StringBuilder();
        int multi = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isDigit(s.charAt(i))) {
                // 如果该字符是一个数字，更新multi
                multi = multi * 10 + s.charAt(i) - '0';
            } else if (Character.isAlphabetic(s.charAt(i))) {
                // 如果该字符是一个字母，累加到temp中
                temp.append(s.charAt(i));
            } else if (s.charAt(i) == '[') {
                // 如果是左括号，把当前状态压入栈；同时清空当前状态
                digits.push(multi);
                strings.push(temp);
                multi = 0;
                temp = new StringBuilder();
            } else if (s.charAt(i) == ']') {
                // 如果是右括号，栈顶元素 + multi * temp
                int current = digits.pop();
                StringBuilder prefix = strings.pop();
                for (int j = 0; j < current; ++j) {
                    prefix.append(temp);
                }
                temp = prefix;
            }
        }
        System.out.println(temp.toString());
        return s;
    }
}
