// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String countAndSay(int n) {
        if(n==1) return "1";
        
        String say = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<say.length()){
            char ch = say.charAt(i);
            int count =1;
            while(i+1<say.length() && say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            result.append(count).append(ch);
            i++;
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        // Test it
        System.out.println(countAndSay(1)); // 1
        System.out.println(countAndSay(2)); // 11
        System.out.println(countAndSay(3)); // 21
        System.out.println(countAndSay(4)); // 1211
        System.out.println(countAndSay(5)); // 111221
    }
}



