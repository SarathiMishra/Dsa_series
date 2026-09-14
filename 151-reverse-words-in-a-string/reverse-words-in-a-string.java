class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            //remove all the trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //Check the value of i
            if(i < 0){
                break;
            }
            int j = i;
            //find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //When j come up to the space index, then stop
            //then add/append the word
            ans.append(s.substring(j+1, i+1));

            //remove unnecessary space when j is standing and add a space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //j < 0, means we are on first word so no space needed
            //j >= 0, space needed
            if(j >= 0){
                ans.append(' ');
            }
            //place i at the last index of the remaining string
            i = j;
        }
        return ans.toString();
    }
}