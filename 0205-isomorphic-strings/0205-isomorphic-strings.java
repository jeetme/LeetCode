class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            boolean hasMismatchS = mapS.containsKey(charS) && mapS.get(charS) != charT;
            boolean hasMismatchT = mapT.containsKey(charT) && mapT.get(charT) != charS;
            if(hasMismatchS || hasMismatchT) {
                return false;
            }
            
            mapS.put(charS, charT);
            mapT.put(charT, charS);
        }
        return true;
    }
}