class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        String lengthStr = String.valueOf(x);
        
        for(int i=0; i< lengthStr.length(); i++){
            sum += Character.getNumericValue(lengthStr.charAt(i));
            
        }
        
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
            
    }
}