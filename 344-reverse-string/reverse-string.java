class Solution {
    public void swap(char[] s, int start, int end){
        //base case
        if(start >= end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
        //recursive call
        swap(s, start+1, end-1);
    }
    public void reverseString(char[] s) {
        swap(s, 0, s.length-1);
        //Normal Method

        // int start = 0;
        // int end = s.length-1;

        // while(start < end){
        //     //swap
        //     char temp = s[start];
        //     s[start] = s[end];
        //     s[end] = temp;

        //     start += 1;
        //     end -= 1;
        // }
    }
}