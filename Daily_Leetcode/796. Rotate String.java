class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }
         
        for (int i = 1; i < s.length(); i++) {

            String front = s.substring(0, i);
            String remain = s.substring(i);

            if (goal.equals(remain + front)) {
                return true;
            }
        } 

        return false;
    }
}
