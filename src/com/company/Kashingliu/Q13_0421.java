package com.company.Kashingliu;

import java.util.HashMap;

public class Q13_0421 {
    int map(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            if (map(s.charAt(i)) < map(s.charAt(i + 1))) {
                res -= map(s.charAt(i));
            } else {
                res += map(s.charAt(i));
            }
        }
        return res +  map(s.charAt(s.length() - 1));
    }
}
