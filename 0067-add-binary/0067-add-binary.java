class Solution {
    public String addBinary(String a, String b) {
        String sum = "";
        while(a.length() != b.length()) {
            if(a.length() < b.length()) {
                a = "0" + a;
            } else {
                b = "0" + b;
            }
        }

        String carry = "0";
        for(int i = a.length() - 1; i >= 0; i--) {
            if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                if(carry == "0") {
                    sum = "0" + sum;
                } else {
                    sum = "1" + sum;
                    carry = "0";
                }
            } else if(a.charAt(i) == '0' && b.charAt(i) == '1' ||
                a.charAt(i) == '1' && b.charAt(i) == '0') {
                if(carry == "0") {
                    sum = "1" + sum;
                } else {
                    sum = "0" + sum;
                    carry = "1";
                }
            } else {
                if(carry == "0") {
                    sum = "0" + sum;
                    carry = "1";
                } else {
                    sum = "1" + sum;
                    carry = "1";
                }
            }
        }
        return carry == "0" ? sum : "1" + sum;
    }
}