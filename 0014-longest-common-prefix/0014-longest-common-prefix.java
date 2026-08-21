class Solution {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String common = strs[0];
        for(int i = 0; i < strs.length - 1; i++) {
            common = compare(common, strs[i + 1]);
        }
        return common;
    }

    String compare(String a, String b) {
        String common  = "";
        for(int i = 0; i < a.length() && i < b.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) {
                common += a.charAt(i);
            } else {
                break;
            }
        }
        return common;
    }
}