class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    List<Integer> t = res.get(i - 1);
                    temp.add(t.get(j - 1) + t.get(j));
                }
            }
            res.add(temp);
        }

        return res;
    }
}
