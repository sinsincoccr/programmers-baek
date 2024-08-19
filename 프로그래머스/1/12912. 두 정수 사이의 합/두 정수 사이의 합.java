class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int sort =0;
        
        if(a<b){
            
        }else{
            sort = b;
            b = a;
            a = sort;
        }
        
        for(int i = a; i<b; i++){
            answer += i;
        }
        
        return answer + b;
    }
}