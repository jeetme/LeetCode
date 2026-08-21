class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> intByRoman = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int num = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            int curr = intByRoman.get(s.charAt(i));
            int next = intByRoman.get(s.charAt(i + 1));
            if(curr < next) {
                num -= curr;
            } else {
                num += curr;
            }
        }
        return num + intByRoman.get(s.charAt(s.length() - 1));
    }
}