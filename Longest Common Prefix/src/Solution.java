public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        String firstStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(firstStr) != 0){
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }
        }
        return firstStr;
    }
}
