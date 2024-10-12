class Solution {
    public String frequencySort(String s) {
        Stack<Character> increase = new Stack<>();
        Stack<Character> reverse = new Stack<>(); 

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        // System.out.println(freq);

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();
            if (!increase.isEmpty() && freq.get(ch) < freq.get(increase.peek())) {
                while (!increase.isEmpty() && freq.get(increase.peek()) > freq.get(ch)) {
                    reverse.push(increase.pop());
                }
                increase.push(ch);
                while (!reverse.isEmpty()) {
                    increase.push(reverse.pop());
                }
            } else {
                increase.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!increase.isEmpty()) {
            char ch = increase.pop();
            int time = freq.get(ch);


            for (int i = 0; i < time; i++) {
                ans.append(ch);
            }
        }

        // System.out.println(increase);
        return ans.toString();


    }
}
