class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i].isEmpty())
                continue;

            ans.append(arr[i]).append(" ");
        }

        return ans.toString().trim();
    }
}