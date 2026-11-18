class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
       solved("", 0, 0, n, ans);
       return ans;
    }
    private void solved(String curr, int open, int closed, int total, List<String> ans){
        //Base case
        //We need n opening brackets
        //We need n closing brackets
        //Total length = 2 * n.
        if(curr.length() == 2 * total){
            ans.add(curr);
            return;
        }
        //Condition 1
        //If opening brackets are still available, add ( and increase open
        if(open < total){
            solved(curr+"(", open+1, closed, total, ans);
        }
        //Condition 2
        //If an opening bracket is available to close, add ) and increase closed
        if(closed < open){
            solved(curr+")", open, closed+1, total, ans);
        }
    }
}