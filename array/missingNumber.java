public class missingNumber {
    public void missingNumber(int[] arr){
        int xor =0;
        int n= arr.length;

        for(int i=0;i<=n;i++){
            xor ^= i;
        }
        for(int ar : arr){
            xor ^= ar;
        }
          // The missing number is found in xor
        System.out.println(xor);
    }
  
    public static void main(String[] args) {
        missingNumber mn = new missingNumber();
        int[] arr = {0, 1, 2, 3, 5}; // Example array with a missing number
        mn.missingNumber(arr);
    }
    
}
