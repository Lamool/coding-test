class Solution {
    public int solution(int[] array, int n) {
        int min = array[0];
        int gap = Math.abs(n - array[0]);
        
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[i]) < gap) {
                min = array[i];
                gap = Math.abs(n - array[i]);
            } else if (Math.abs(n - array[i]) == gap) {
                if (array[i] < min) min = array[i];
            }
            System.out.println(min);
            System.out.println(gap);
        }
    
        return min;
    }
}