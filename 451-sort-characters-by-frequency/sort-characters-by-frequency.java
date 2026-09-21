class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.keySet().forEach(
            ch->{
                if(arr[map.get(ch)] == null){
                    arr[map.get(ch)] = new ArrayList();
                }
                arr[map.get(ch)].add(ch);
            }
        );
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] != null){
                for(Character ch: arr[i]){
                    for(int j=0; j<i; j++){
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}