import java.util.*;

class Solution {
    public long solution(long n) {
        String list [] = String.valueOf(n).split("");
        
        Arrays.sort(list);
        
        StringBuilder text = new StringBuilder();
        
        for(String fullList : list){
            text.append(fullList);
        }

        return Long.parseLong(text.reverse().toString());
    }
}