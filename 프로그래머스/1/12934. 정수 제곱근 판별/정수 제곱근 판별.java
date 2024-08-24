class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i =0; i < 50000000; i++){
            if(i * i == n){
                answer = (i+1) * (i+1);
            }
        }
        
        if(answer == 0){
            return -1;
        }
        
        
        return answer;
    }
}