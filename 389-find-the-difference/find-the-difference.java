class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : s.toCharArray()){
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        for(char key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
    
        return ' ';
    }
}