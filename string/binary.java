// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class binary {
    public static String addBinary(String a , String b) {
        StringBuilder result = new StringBuilder();
        int i= a.length()-1;
        int j= b.length()-1;
        int carry =0;
        while(i>=0 || j>=0 || carry !=0){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum%2);
            carry = sum/2;
        }
        return result.reverse().toString();
    }
    
    public static void main(String[] args) {
        // Test it
        System.out.println(addBinary("11", "1")); // 100
        System.out.println(addBinary("1010", "1011")); // 10101
        System.out.println(addBinary("1101", "1010")); // 10111
    }
}





