class Solution {
    public int minSwaps(String s) {
        int open = 0;
        int close = 0;
        int count = 0;

        int i = 0;
        int j = s.length() - 1; 

        while (i < j) {
            if (s.charAt(i) == ']') {
                close++;
            }

            if (s.charAt(i) == '[') {
                open++;
            }

            if (close > open) {
                while (s.charAt(j) == ']') {
                    j--;
                }
                j--;
                close--;
                open++;
                count++;
            }
            i++;
        }

        return  count;
    }
}
