package com.company.Kashingliu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q93_0614 {
    public List<String> res = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    public void helper(String s, int chance) {
        if (chance < 0 && s.length() > 0) {
            return;
        }
        if (path.size() == 4 && chance == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(path.get(0)).append('.').append(path.get(1)).append('.').append(path.get(2)).append('.').append(path.get(3));
            res.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < 3; ++i) {
            if (s.length() <= i) {
                continue;
            }
            String prefix = s.substring(0, i + 1);
            int pre = Integer.parseInt(prefix);
            String last = s.substring(i + 1);
            if ((chance + 1) * 3 < last.length()) {
                continue;
            } else if (pre > 255) {
                continue;
            } else if (prefix.length() > 1 && prefix.charAt(0) == '0') {
                continue;
            }
            path.add(pre);
            helper(s.substring(i + 1), chance - 1);
            path.remove(path.size() - 1);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return new ArrayList<>();
        }
        helper(s, 3);
        System.out.println(res);
        return res;
    }
}
