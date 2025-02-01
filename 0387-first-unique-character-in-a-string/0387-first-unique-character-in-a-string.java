class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] cd= s.toCharArray();
    
        for(int i=0;i<cd.length;i++){
            map.put(cd[i], map.getOrDefault(cd[i], 0) + 1);
        } 

        for(int i=0;i<cd.length;i++){
          if (map.get(cd[i]) == 1) {
             return i;
           }
        }
       
        return -1;
    }
}