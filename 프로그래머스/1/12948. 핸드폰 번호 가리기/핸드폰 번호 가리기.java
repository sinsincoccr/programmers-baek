class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        
        int lengthStr = phone_number.length();
        
        System.out.println(lengthStr);
        
        for(int i=0; i< lengthStr; i++){
            if(lengthStr - i > 4){
                answer.append('*');
            }else{
                answer.append(phone_number.charAt(i));
            }
        }
        
        return answer.toString();
    }
}