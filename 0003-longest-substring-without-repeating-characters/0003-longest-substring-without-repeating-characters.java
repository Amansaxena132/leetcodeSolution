class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left =0;
     int right=0;
     int maxlength=0;

     HashMap<Character,Integer> map=new HashMap<>();
     
     while(right<s.length()){

        char currentChar = s.charAt(right);

        if(map.containsKey(s.charAt(right))){
            left=Math.max(left,map.get(currentChar)+1);
        }
     
 
        map.put(currentChar,right);

        maxlength=Math.max(maxlength,right-left+1);

        right++;
     }
        
     return maxlength;

    }
}