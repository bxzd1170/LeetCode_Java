package easy;

import java.util.HashMap;

class LC01_TwoSum {
    // 解法1：暴力双重循环
    public static int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    //解法二：哈希表
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // 测试入口
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res1 = twoSum1(nums, target);
        int[] res2 = twoSum2(nums, target);
        System.out.println("暴力解法下标："+res1[0]+","+res1[1]);
        System.out.println("哈希解法下标："+res2[0]+","+res2[1]);
    }
}