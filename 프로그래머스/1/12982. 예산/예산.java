import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int n =0;
        Arrays.sort(d);
        
        while(d.length > n){
            if(answer < budget){
                answer += d[n];
            }else{
                break;
            }
            n++;
        }
        
        if(answer > budget){
                n--;
            }
        
        return n;
    }
}