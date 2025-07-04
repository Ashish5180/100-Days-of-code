
    public class rotateArrayss{
    public void rotate(int[] nums , int k){
        int n = nums.length;
        k = k%n;
        if (k == 0) return; // No rotation needed

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }

    public void reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotateArrayss ra = new rotateArrayss();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        ra.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

