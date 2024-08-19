class Solution {
    boolean solution(String s) {
        String sChange = "";
        int countP = 0;
        int countY = 0;
    
        sChange= s.toLowerCase();
        
        for(int i=0; i < sChange.length(); i++){
            if(sChange.charAt(i) == 'p'){
                countP += 1;
            }
            if(sChange.charAt(i) == 'y'){
                countY += 1;
            }
        }
        
        return countP == countY;

       
    }
}