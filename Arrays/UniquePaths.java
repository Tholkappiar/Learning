import java.util.HashMap;

class UniquePaths {
    public int uniquePaths(int m, int n) {
        // HashMap<String, Integer> memo = new HashMap<>();
        // return paths(0, 0, m, n, memo);
        int N = n + m - 2;
            int r = m - 1; 
            double res = 1;
            
            for (int i = 1; i <= r; i++)
                res = res * (N - r + i) / i;
            return (int)res;
    }

    public int paths(int i, int j, int m, int n, HashMap<String, Integer> memo) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (i >= m || j >= n)
            return 0;

        String key = i + "" + j;
        if (memo.containsKey(key))
            return memo.get(key);
        else {
            int result = paths(i + 1, j, m, n, memo) + paths(i, j + 1, m, n, memo);
            memo.put(key, result);
            return result;
        }
    }
}
