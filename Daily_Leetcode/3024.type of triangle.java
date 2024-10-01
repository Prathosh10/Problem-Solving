class Solution {
    public String triangleType(int[] nums) {
        int ab = nums[0] + nums[1];
        int bc = nums[1] + nums[2];
        int ac = nums[0] + nums[2];

        if (ab > nums[2] && bc > nums[0] && ac > nums[1]) {
            if (nums[0] == nums[1] & nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                return "isosceles";
            } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]){
                return "scalene";
            }
        } 

        return "none";
        
    }
}


