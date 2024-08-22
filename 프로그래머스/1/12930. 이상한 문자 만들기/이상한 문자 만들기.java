class Solution {
    public String solution(String s) {
        StringBuilder sentence = new StringBuilder(); 
        int index =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                sentence.append(' ');
                index = 0;
            }else if(index % 2 == 0){
                sentence.append(Character.toUpperCase(s.charAt(i)));
                index ++;
            }else{
                sentence.append(Character.toLowerCase(s.charAt(i)));
                index ++;
            }
            
        }
        
        return sentence.toString();
    }
}