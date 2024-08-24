class Solution {
    public int[] solution(long n) {
        String text = "" + n;
        int[] answer = new int[text.length()];
        int count =0;
        
        
        for(int i = text.length() - 1; i >= 0; i--){
            answer[count] = text.charAt(i) - '0';
            count ++;
        }
        
        
        return answer;
    }
}