class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int count = 0;
        
        
        StringBuilder[] map1 = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            map1[i] = new StringBuilder();
        }
        
        
        while(n > count){
            int count2 = 0;
            while(n > count2){
                if(arr1[count] % 2 == 0){
                    map1[count].append(0);
                }else{
                    map1[count].append(1);
                }
                arr1[count] /= 2;
                    count2++;
            }
            map1[count].reverse();
            count ++;
            
        }
        

        
        
        // map2
        StringBuilder[] map2 = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            map2[i] = new StringBuilder();
        }
        
        count = 0;
        while(n > count){
            int count2 = 0;
            while(n > count2){
                if(arr2[count] % 2 == 0){
                    map2[count].append(0);
                }else{
                    map2[count].append(1);
                }
                arr2[count] /= 2;
                    count2++;
            }
            map2[count].reverse();
            count ++;
            
        }
        
        // result
        String[] result = new String[n];
        
        count = 0;
        while(n > count){
            StringBuilder text = new StringBuilder();
            int count2 = 0;
            while(n> count2){
                if(map1[count].charAt(count2) == '0' && map2[count].charAt(count2) == '0'){
                    text.append(' ');
                }else{
                    text.append('#');
                }
                count2++;
            }
            result[count] = text.toString();
            count++;
        }
        
        return result;

    }
}