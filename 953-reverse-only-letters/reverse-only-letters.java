class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while(start <= end){
           //This checks if the character at the current start position is not a letter. If it is a symbol, number, or space, the code executes start++;. This moves the left pointer one step to the right, skipping over that non-letter character
            if(!Character.isLetter(chars[start])){
                start++;
            }
            //If the character at start is a letter, the code moves to this condition. It checks if the character at the current end position is not a letter. If it is a symbol, number, or space, it executes end--;. This moves the right pointer one step to the left, skipping that non-letter character
            else if(!Character.isLetter(chars[end])){
                end--;
            }else{
                 //If both are letters! Swap them and move both pointers closer.
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}