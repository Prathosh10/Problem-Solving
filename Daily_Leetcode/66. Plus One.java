class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = (sum) % 10;
            carry = (sum) / 10;
        } 

        if (carry == 0) {
            return digits;
        } else {
            int[] res = new int[digits.length + 1];

            for (int i = res.length - 1; i >= 1; i--) {
                res[i] = digits[i - 1];
            } 
            res[0] = carry;

            return res;
        }

    }
}

