class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i = 0, j = arr.length - 1;
        if (arr.length < 3) {
            return false;
        }

        while (i < j) {
            if (!(i + 1 < arr.length && arr[i] < arr[i + 1])) {
                break;
            }
            i++;
        }
        if (i == j) {
            return false;
        }
        
        while (i < j) {
            if (!(j - 1 > 0 && arr[j - 1] > arr[j])) {
                break;
            }
            j--;
        }


        return i == j;
    }
}
