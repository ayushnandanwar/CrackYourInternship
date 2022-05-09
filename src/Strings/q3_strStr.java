package Strings;

//https://leetcode.com/problems/implement-strstr/

public class q3_strStr {

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));

    }

    public static int strStr(String haystack, String needle) {
        if(haystack.length() == 0) return -1;


        for(int i = 0;i < haystack.length() - needle.length() + 1;i++){
            boolean found = true;
            int k = 0;
            int j = i;
            while(k < needle.length()){
                if(haystack.charAt(j++) != needle.charAt(k++)){
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }
}
