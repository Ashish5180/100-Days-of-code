
class romanInteger {
    public static void main(String[] args) {
        String s = "XIVVM";
        int[] roman = new int[26]; // ASCII Value
        
        roman['I' - 'A'] = 1;
        roman['V' - 'A'] = 5;
        roman['X' - 'A'] = 10;
        roman['L' - 'A'] = 50;
        roman['C' - 'A'] = 100;
        roman['D' - 'A'] = 500;
        roman['M' - 'A'] = 1000;
        
        int result =0;
        
        for(int i=0;i<s.length();i++){
            int curr = roman[s.charAt(i)-'A'];
            int next = (i+1<s.length()) ?roman[s.charAt(i+1) - 'A'] :0 ;
            
            if(curr<next){
                result -= curr;
            }else{
                result += curr;
            }
        }
        System.out.println(result);
    }
    
}





