class Solution {
    public String reverseVowels(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(isVowel(curr)) {
                charStack.push(curr);
            }
        }

        String modifiedString = "";
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(isVowel(curr)) {
                modifiedString += charStack.pop();
                continue;
            }
            modifiedString += curr;
        }
        return modifiedString;
    }

    boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) > -1;
    }
}