import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        
        int maxSelection = nums.length / 2;
        
         
        if (set.size() > maxSelection) {
            return maxSelection;
        } else {
            return set.size();
        }
    }
}