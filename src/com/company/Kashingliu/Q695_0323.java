package com.company.Kashingliu;

public class Q695_0323 {
    public int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || r >= grid[0].length || grid[r][c] == '0') {
            return 0;
        }
        grid[r][c] = '0';
        int res = 1;
        res += dfs(grid, r - 1, c);
        res += dfs(grid, r + 1, c);
        res += dfs(grid, r, c - 1);
        res += dfs(grid, r, c + 1);
        return res;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int max = 0;
        for (int i = 0; i < nr; ++i) {
            for (int j = 0; j < nc; ++j) {
                if (grid[i][j] == '1') {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
}
