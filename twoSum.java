import java.util.*;

class  twoSum{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println("Indexes are: " + map.get(diff) + ", " + i);
                return new int[]{map.get(diff), i}; 
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        twoSum s = new twoSum();
        int[] nums = {4, 5, 6, 8, 9};
        int target = 11;
        int[] result = s.twoSum(nums, target);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}


// this have time complexity of O(n) and space complexity of O(n)

// but in brute force it have time complexity of O(n^2) and space complexity of O(1)
