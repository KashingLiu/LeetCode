package com.company.Kashingliu;

import java.util.HashMap;

public class Q739_0612 {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;
        hashMap.put(temperatures[temperatures.length - 1], temperatures.length - 1);
        for (int i = temperatures.length - 2; i >= 0; --i) {
            int resLen = Integer.MAX_VALUE;
            for (int j = temperatures[i] + 1; j <= 100; ++j) {
                if (hashMap.containsKey(j)) {
                    resLen = Math.min(resLen, hashMap.get(j) - i);
                }
            }
            res[i] = resLen == Integer.MAX_VALUE ? 0 : resLen;
            hashMap.put(temperatures[i], i);
        }
        return res;
    }
    public int[] dailyTemperatures1(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        res[len - 1] = 0;
        for (int i = len - 2; i >= 0; --i) {
            // 每次找的时候搜索范围在j += res[j]内，这样是为了保证找的每个数都比temperatures[i + 1]大
            for (int j = i + 1; j < len; j += res[j]) {
                // 找到了比T[i]还大的值则计算长度
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) {
                    // 没找到，则T[i]最大，res记为0
                    res[i] = 0;
                    break;
                }
            }
        }
        return res;
    }
}
