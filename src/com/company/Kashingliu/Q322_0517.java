package com.company.Kashingliu;

public class Q322_0517 {
    public int backtrace(int[] coins, int amount, int[] count) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (count[amount - 1] != 0) {
            return count[amount - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; ++i) {
            int a = backtrace(coins, amount - coins[i], count);
            if (a >= 0 && a < min) {
                min = a + 1;
            }
        }
        count[amount - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[amount - 1];
    }
    public int coinChange(int[] coins, int amount) {
        return backtrace(coins, amount, new int[amount]);
    }
}
