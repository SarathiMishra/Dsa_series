class Solution {
    public int myAtoi(String s) {
        //condition 1
        s = s.trim();
        long num = 0;
        if(s.isEmpty()){
            return 0;
        }
        
        int i = 0;
        int sign = 1;
        int n = s.length();
        //condition 2
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-')?-1 : 1;
            i++;
        }
        //condition 3
        while(i<n && Character.isDigit(s.charAt(i))){
            num = num*10+(s.charAt(i) -'0');
            if(num*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*num);
    }
}