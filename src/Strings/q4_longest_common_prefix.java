package Strings;

//https://leetcode.com/problems/longest-common-prefix/

public class q4_longest_common_prefix {

    public static void main(String[] args) {
        String str[] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }

    public String longestCommonPrefixLeetcodeSol(String[] strs) {  // optimized
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {  // brute force
        int l = strs.length;
        int minL = Integer.MAX_VALUE;
        for(int i = 0;i < l;i++){
            if(minL > strs[i].length()){
                minL = strs[i].length();
            }
        }
        String ans = "";
        for(int i = 0;i < minL;i++){
            boolean done = false;
            int j;
            for(j = 0;j < l -1 ;j++){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    done = true;
                    break;
                }
            }
            if(done) break;
            else ans += strs[j].charAt(i);
        }
        return ans;
    }
}
