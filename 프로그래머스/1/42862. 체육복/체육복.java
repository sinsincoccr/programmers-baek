import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int k=0; k < lost.length; k++){
            for(int l=0; l < reserve.length; l++){
                if(lost[k] == reserve[l]){
                    count --;
                    lost[k] = -1;
                    reserve[l] = -1;
                    break;
                }
            }
        }
        
        
        for(int i=0; i < lost.length; i++){
            if (lost[i] == -1) continue;
            for(int j=0; j < reserve.length; j++){
                if(lost[i] == reserve[j] -1 || lost[i] == reserve[j] +1){
                    if (reserve[j] == -1) continue;
                    count --;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return n - count;
    }
}