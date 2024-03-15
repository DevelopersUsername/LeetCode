class Solution {
    public boolean hasAlternatingBits(int n) {

        char[] arr = Integer.toBinaryString(n).toCharArray();
        if (arr.length == 2) return arr[0] != arr[1];

        for (int i = 1; i < arr.length - 1; i++)
            if (arr[i - 1] == arr[i] || arr[i] == arr[i + 1]) return false;


        return true;
    }
}