class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        if(image[sr][sc] == color) return image;

        helper(sr, sc, image[sr][sc], color, n, m, image);

        return image;
    }

    void helper(int sr, int sc, int color, int newColor, int n, int m, int[][] image) {

        if(sr < 0 || sr >= n || sc < 0 || sc >= m || image[sr][sc] != color) return;

        image[sr][sc] = newColor;

        helper(sr + 1, sc, color, newColor, n, m, image);
        helper(sr - 1, sc, color, newColor, n, m, image);
        helper(sr, sc + 1, color, newColor, n, m, image);
        helper(sr, sc - 1, color, newColor, n, m, image);
    }
}