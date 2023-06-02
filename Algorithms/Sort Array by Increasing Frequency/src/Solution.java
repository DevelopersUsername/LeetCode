import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0) + 1);

        int idx = 0;
        int[][] arr = new int[map.size()][2];
        for(int i : map.keySet()){
            arr[idx][0] = i;
            arr[idx++][1] = map.get(i);
        }

        Arrays.sort(arr, (i, j) -> {
            if (i[1] > j[1])
                return 1;
            if (i[1] < j[1])
                return -1;
            if(i[0] > j[0])
                return -1;
            return 1;});

        idx = 0;
        for(int i = 0; i < arr.length; i++){
            while(arr[i][1] --> 0)
                nums[idx++] = arr[i][0];
        }
        return nums;
    }
}