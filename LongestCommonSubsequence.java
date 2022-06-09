public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String word1 = "abce";
        String word2 = "abece";

        int m = word1.length();

        int n = word2.length();

        int[][] result = new int[m+1][n+1];

        for (int i=1; i<=m; i++) {

            for (int j=1; j<=n; j++) {

                if (word1.charAt(i-1) == word2.charAt(j-1)) {

                    result[i][j] = 1 + result[i-1][j-1];

                } else {

                    result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
                }
            }
        }

        System.out.println(result[m][n]);

    }
}
