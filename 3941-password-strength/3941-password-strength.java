class Solution {
    public int passwordStrength(String password) {
        int strength = 0;
        Set<Character> chars = new HashSet<>();
        for(var ch : password.toCharArray()) {
            chars.add(ch);
        }
        for(var ch : chars) {
            if('a' <= ch && ch <= 'z') {
                strength += 1;
            } else if('A' <= ch && ch <= 'Z') {
                strength += 2;
            } else if('0' <= ch && ch <= '9') {
                strength += 3;
            } else {
                strength += 5;
            }
        }
        return strength;
    }
}