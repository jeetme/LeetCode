class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }

        outer:
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                int h = i, n = 0;
                inner:
                while(n < needle.length()) {
                    if(h >= haystack.length() ||
                        needle.charAt(n++) != haystack.charAt(h++)) {
                            continue outer;
                    }
                }
                return i;
            }
        }
        return -1;
    }
}