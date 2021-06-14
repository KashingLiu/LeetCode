package com.company.Kashingliu;

import java.util.ArrayList;

public class Q679_0425 {
    private boolean result = false;
    public void backtrace(ArrayList<Double> content) {
        if (content.size() == 1) {
            result = Math.abs(content.get(0) - 24.0) < Math.pow(10, -6);
            return;
        }
        for (int i = 0; i < content.size() - 1; ++i) {
            for (int j = i + 1; j < content.size(); ++j) {
                double a = content.get(i);
                double b = content.get(j);
                ArrayList<Double> filter = new ArrayList<>();
                for (int k = 0; k < content.size(); ++k) {
                    if (k != i && k != j) {
                        filter.add(content.get(k));
                    }
                }
                double temp = a + b;
                filter.add(temp);
                backtrace(filter);
                filter.remove(filter.size() - 1);
                temp = a * b;
                filter.add(temp);
                backtrace(filter);
                filter.remove(filter.size() - 1);
                if (b > Math.pow(10, -6) && a > Math.pow(10, -6) ) {
                    temp = a / b;
                    filter.add(temp);
                    backtrace(filter);
                    filter.remove(filter.size() - 1);
                    temp = b / a;
                    filter.add(temp);
                    backtrace(filter);
                    filter.remove(filter.size() - 1);
                } else {
                    filter.add(0.0);
                    backtrace(filter);
                    filter.remove(filter.size() - 1);
                }
                temp = a - b;
                filter.add(temp);
                backtrace(filter);
                filter.remove(filter.size() - 1);
                temp = b - a;
                filter.add(temp);
                backtrace(filter);
                filter.remove(filter.size() - 1);
            }
        }
    }
    public boolean judgePoint24(int[] nums) {
        ArrayList<Double> content = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            content.add((double)nums[i]);
        }
        backtrace(content);
        return result;
    }
}
