class Solution {
    public int[][] solution(int[][] arr) {
        int width = 0;
        int height = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            if (width < arr[i].length) {
                width = arr[i].length;
            }
        }
        
        if (width > height) {
            height = width;
        } else {
            width = height;
        }
        
        int[][] answer = new int[width][width];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}