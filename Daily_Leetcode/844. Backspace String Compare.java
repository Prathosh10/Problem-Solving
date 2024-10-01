class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }

    private String check(String s) {
        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                s1.push(s.charAt(i));
            } else {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            }
        }

        String res = "";

        for (char ch : s1) {
            res += ch;
        }

        return res;
    }
}


