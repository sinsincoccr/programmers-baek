class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int round =0;
        
        while(n > round){
            if(round % 2 == 0){
                answer.append("수");
            }
            else{
                answer.append("박");
            }
            round++;
        }
        
        
        return answer.toString();
    }
}