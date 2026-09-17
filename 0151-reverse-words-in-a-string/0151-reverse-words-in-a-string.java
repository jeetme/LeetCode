import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        List<String> words = new ArrayList<>();
        while(st.hasMoreTokens()) {
            words.add(st.nextToken());
        }
        String modified = "";
        for(var word : words) {
            modified = word + " " + modified;
        }
        return modified.trim();
    }
}