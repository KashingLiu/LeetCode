package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;


public class Q54_0508 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = Math.min(m, n) / 2 + 1;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < n - i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            for (int j = i + 1; j < m - i; j++) {
                System.out.print(matrix[j][n - i - 1] + " ");
            }
            for (int j = n - i - 2; j >= i && m - 1 - i != i; --j) {
                System.out.print(matrix[m - i - 1][j] + " ");
            }
            for (int j = m - 2 - i; j >= i + 1 &&  n - 1 - i != i; --j) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        List<Integer> result = new LinkedList<>();
        return result;
    }
}
