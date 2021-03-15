package com.company.Kashingliu;

import java.util.HashMap;
import java.util.Map;

public class Q3_0304 {
    public int lengthOfLongestSubstring(String s) {
        int result = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        boolean flag = false;
        for (int j = 0; j < s.length(); ++j) {
            if (map.containsKey(s.charAt(j))) {
                int temp = map.get(s.charAt(j)+1);

                map.put(s.charAt(j), map.get(s.charAt(j)+1));
                if (map.get(s.charAt(j)) >= 2) {
                    flag = true;
                }
            } else {
                map.put(s.charAt(j), 1);
            }
            while (flag == true) {
                result = Math.max(result, j - i + 1);
                while (s.charAt(i) != s.charAt(j)) {
                    map.put(s.charAt(i), map.get(s.charAt(i)-1));
                    i--;
                }
            }

        }
        return result;
    }
}
