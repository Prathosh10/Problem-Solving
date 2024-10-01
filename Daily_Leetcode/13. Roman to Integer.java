class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> symbol = new HashMap<>();
        symbol.put("I", 1);
        symbol.put("V", 5);
        symbol.put("X", 10);
        symbol.put("L", 50);
        symbol.put("C", 100);
        symbol.put("D", 500);
        symbol.put("M", 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = s.charAt(i) + "";

            if(i + 1 < s.length() && symbol.get(temp) < symbol.get(s.charAt(i + 1) + "")) {
                sum -= symbol.get(temp);
            } else {
                sum += symbol.get(temp);
            }
        }

        return sum;
    }
}


