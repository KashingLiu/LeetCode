package com.company.Kashingliu;

public class Q43_0613 {
    public String multiply(String num1, String num2) {
        if (num2.equals("0") || num1.equals("0")) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (int j = num2.length() - 1; j >= 0; --j) {
            StringBuilder temp = new StringBuilder();
            int flag = 0;
            for (int i = num1.length() - 1; i >= 0; --i) {
                int left = num1.charAt(i) - '0';
                int right = num2.charAt(j) - '0';
                int last = (left * right + flag) % 10;
                flag = (left * right + flag) / 10;
                temp.insert(0, last);
            }
            if (flag != 0) {
                temp.insert(0, flag);
            }
            for (int k = 0; k < num2.length() - j - 1; ++k) {
                temp.append(0);
            }
            if (res.length() == 0) {
                res = temp;
            } else {
                int oldLen = res.length();
                for (int i = 0; i < temp.length() - oldLen; ++i) {
                    res.insert(0, 0);
                }
                int len = res.length();
                StringBuilder add = new StringBuilder();
                int insert = 0;
                for (int i = len - 1; i >= 0; --i) {
                    int a = res.charAt(i) - '0';
                    int b = temp.charAt(i) - '0';
                    int last = (a + b + insert) % 10;
                    insert = (a + b + insert) / 10;
                    add.insert(0, last);
                }
                if (insert != 0) {
                    add.insert(0, 1);
                }
                res = add;
            }
        }
        return res.toString();
    }
}
