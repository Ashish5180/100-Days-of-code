public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,2,2,3};

        int slow = arr[0];
        int fast = arr[0];

        do { 
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
 // time complexity O(n) and space complexity O(1)
        // The duplicate number is found at the position of slow or fast pointer
        System.out.println(slow);
    }
}
