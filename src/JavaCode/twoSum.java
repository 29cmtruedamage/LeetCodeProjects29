package JavaCode;

import java.util.HashMap;

public class twoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] resultArr = new int[2];
            for(int i = 0; i < nums.length; i++){
                int gesucht = target - nums[i];
                if(map.containsKey(gesucht)){
                    resultArr[0] = map.get(gesucht);
                    resultArr[1] = i;
                    return resultArr;

                }else{
                    map.put(nums[i], i);
                }
            }
            return resultArr;
        }
}
