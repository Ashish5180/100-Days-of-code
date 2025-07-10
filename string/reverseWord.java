public class reverseWord {
    public static String reverseWord(String s){
        char[] arr = s.toCharArray();
        int start =0;
        for(int end =0;end<= arr.length;end++){
            if(end == arr.length || arr[end] == ' '){
                reverse(arr , start , end -1);
                start = end +1;
            }
        }
        return new String(arr);  
    }
    private static void reverse(char[] arr, int left, int right) {
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
        String input = "Hello World Java";
        System.out.println(reverseWord(input));  
    }

}



// String builder approach
// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split(" ");
//         StringBuilder result  = new StringBuilder();

//         for(String word : words){
//             result.append(new StringBuilder(word).reverse()).append(" ");
//         }
//         return result.toString().trim();
//     }
// }