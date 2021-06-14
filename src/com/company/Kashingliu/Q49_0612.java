package com.company.Kashingliu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49_0612 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String key = new String(cur);
            hashMap.getOrDefault(key, new ArrayList<>()).add(strs[i]);
        }
        for (String i: hashMap.keySet()) {
            res.add(hashMap.get(i));
        }
        return res;
    }
}
