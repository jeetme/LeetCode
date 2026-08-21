class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freq = new HashMap<>();
        for(var ch : magazine.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for(var ch : ransomNote.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) - 1);
        }
        for(var entry : freq.entrySet()) {
            if(entry.getValue() < 0) {
                return false;
            } 
        }
        return true;
    }
}
