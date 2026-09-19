class Solution {
    public boolean isAnagram(String s, String t) {
        //Using Map
    //    int s1 = s.length();
    //    int t1 = t.length();
    //    Map<Character, Integer> map = new HashMap<>();
    //    if(s1 != t1){
    //       return false;
    //    }
    //    for(int i=0; i<s1; i++){
    //       Character sc = s.charAt(i);
    //       Character st = t.charAt(i);
    //       map.put(sc, map.getOrDefault(sc,0)+1);
    //       map.put(st, map.getOrDefault(st,0)-1);
    //    }
    //    for(int i:map.values()){
    //         if(i != 0){
    //             return false;
    //         }
    //    }
    //    return true;

        //Using Array
        int s1 = s.length();
        int t1 = t.length();
        if(s1 != t1){
            return false;
        }
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}