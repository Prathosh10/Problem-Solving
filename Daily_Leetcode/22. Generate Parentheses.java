class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n, n, new StringBuilder(), res);
        return res;
    }

    private void generate(int open, int close, StringBuilder brackets, List<String> temp) {
        if (open == 0 && close == 0) {
            temp.add(brackets.toString());
            return;
        }

        if (open > 0) {
            brackets.append("(");
            generate(open - 1, close, brackets, temp);
            brackets.deleteCharAt(brackets.length() - 1);
        }

        if (open < close) {
            brackets.append(")");
            generate(open, close - 1, brackets, temp);
            brackets.deleteCharAt(brackets.length() - 1);
        }
    }
}
