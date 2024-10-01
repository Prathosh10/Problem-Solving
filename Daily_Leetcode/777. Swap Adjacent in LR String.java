class Solution {
    public boolean canTransform(String start, String end) {
        int startIndex = 0;
        int endIndex = 0;
        int n = start.length();

        while (startIndex < n || endIndex < n) {
            while (startIndex < n && start.charAt(startIndex) == 'X') {
                startIndex++;
            } 

            while (endIndex < n && end.charAt(endIndex) == 'X') {
                endIndex++;
            } 

            if (startIndex == n && endIndex == n) {
                return true;
            }

            if (startIndex == n || endIndex == n) {
                return false;
            }

            if (start.charAt(startIndex) != end.charAt(endIndex)) {
                return false;
            }

            if (start.charAt(startIndex) == 'R' && startIndex > endIndex ) {
                return false;
            }

            if (start.charAt(startIndex) == 'L' && startIndex < endIndex ) {
                return false;
            }
            startIndex++;
            endIndex++;
        }

        return true;
    }
}

