class Solution {
    public boolean solution(int x) {
        int answer =0;
        int origin = x;
        while(x > 0){
            answer += x%10;
            x /= 10;  
        }
        
        if(origin % answer == 0){
            return true;
        }else{
            return false;
        }
            
    }
}