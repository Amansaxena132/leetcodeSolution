class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    List<Integer> sd=new ArrayList<>();

        for (int i = 0; i < m; i++) {
            sd.add(nums1[i]);  
        }

        for (int k : nums2) {
            sd.add(k);
        }

        Collections.sort(sd); 

        for (int i = 0; i < m + n; i++) {
            nums1[i] = sd.get(i); 
        }

  }
}